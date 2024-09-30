/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NilaiMahasiswa;

import java.util.Scanner;


public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        ProsesNilai proses = new ProsesNilai(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
        proses.tampilkanHasil();
    }
}

class Mahasiswa {
    String npm;
    String nama;
    double nilaiKehadiran;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;

    public Mahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}

class ProsesNilai extends Mahasiswa {

    public ProsesNilai(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        super(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
    }

    
    public double hitungNilaiAkhir() {
        return (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    
    public String hitungGrade(double nilaiAkhir) {
        if (nilaiAkhir <= 45) return "E";
        else if (nilaiAkhir <= 55) return "D";
        else if (nilaiAkhir <= 65) return "C";
        else if (nilaiAkhir <= 75) return "B";
        else return "A";
    }

        public String keterangan(String grade) {
        switch (grade) {
            case "E":
            case "D": return "KURANG";
            case "C": return "CUKUP";
            case "B": return "BAIK";
            default: return "ISTIMEWA";
        }
    }

    
    public void tampilkanHasil() {
        double nilaiAkhir = hitungNilaiAkhir();
        String grade = hitungGrade(nilaiAkhir);
        String keterangan = keterangan(grade);
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}
