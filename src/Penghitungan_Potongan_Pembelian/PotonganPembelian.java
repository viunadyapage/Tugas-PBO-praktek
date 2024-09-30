/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Penghitungan_Potongan_Pembelian;

import java.util.Scanner;

public class PotonganPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pembelian: ");
        double totalPembelian = input.nextDouble();

        ProsesPembelian pembelian = new ProsesPembelian(totalPembelian);
        pembelian.tampilkanHasil();
    }
}

class Pembelian {
    double totalPembelian;

    public Pembelian(double totalPembelian) {
        this.totalPembelian = totalPembelian;
    }
}

class ProsesPembelian extends Pembelian {

    public ProsesPembelian(double totalPembelian) {
        super(totalPembelian);
    }

    public double hitungPotongan() {
        if (totalPembelian < 50000) {
            return totalPembelian * 0.05;
        } else {
            return totalPembelian * 0.2;
        }
    }

    public double hitungTotalBayar(double potongan) {
        return totalPembelian - potongan;
    }

    public void tampilkanHasil() {
        double potongan = hitungPotongan();
        double totalBayar = hitungTotalBayar(potongan);
        System.out.println("Total Pembelian: Rp. " + totalPembelian);
        System.out.println("Besarnya Potongan: Rp. " + potongan);
        System.out.println("Jumlah yang Harus Dibayarkan: Rp. " + totalBayar);
    }
}
