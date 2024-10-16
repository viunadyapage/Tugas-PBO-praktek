/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KriteriaGemukan;

import java.util.Scanner;

// Main Class
public class IMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Buat objek IndeksMassaTubuh
        IndeksMassaTubuh imt = new IndeksMassaTubuh(beratBadan, tinggiBadan);
        imt.tampilkanHasil();
    }
}

// Class IndeksMassaTubuh
class IndeksMassaTubuh {
    double beratBadan;
    double tinggiBadan;

    public IndeksMassaTubuh(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    // Menghitung nilai IMT
    public double hitungIMT() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    // Menentukan kategori berdasarkan IMT
    public String kategoriIMT(double imt) {
        if (imt < 18.5) return "Berat Badan Kurang";
        else if (imt < 25) return "Berat Badan Ideal";
        else if (imt < 30) return "Berat Badan Lebih";
        else if (imt < 40) return "Gemuk";
        else return "Sangat Gemuk";
    }

    // Menampilkan hasil IMT
    public void tampilkanHasil() {
        double imt = hitungIMT();
        String kategori = kategoriIMT(imt);
        System.out.println("IMT Anda: " + imt);
        System.out.println("Kategori: " + kategori);
    }
}
