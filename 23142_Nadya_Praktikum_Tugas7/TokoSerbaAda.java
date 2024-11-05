/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23142_Nadya_Praktikum_Tugas7;

import java.util.Scanner;

public class TokoSerbaAda {

    static String[] kodeBarang = {"a001", "a002", "a003"};
    static String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
    static int[] hargaBarang = {3000, 4000, 5000};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String belanjaLagi;
        
        do {
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************************");
        
        System.out.print("Masukkan Item Barang: ");
        int itemCount = scanner.nextInt();

        String[] inputKodeBarang = new String[itemCount];
        int[] inputJumlahBeli = new int[itemCount];
        int[] jumlahBayar = new int[itemCount];
        
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Data ke " + (i + 1));

            System.out.print("Masukkan Kode Barang: ");
            inputKodeBarang[i] = scanner.next();
            
            System.out.print("Masukkan Jumlah Beli: ");
            inputJumlahBeli[i] = scanner.nextInt();
            
            int index = findIndex(inputKodeBarang[i]);
            if (index != -1) {
                jumlahBayar[i] = inputJumlahBeli[i] * hargaBarang[index];
            } else {
                System.out.println("Kode barang tidak ditemukan.");
            }
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("==============================");
        System.out.printf("%-5s %-10s %-10s %-5s %-10s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("==============================");

        int totalBayar = 0;
        for (int i = 0; i < itemCount; i++) {
            int index = findIndex(inputKodeBarang[i]);
            if (index != -1) {
                System.out.printf("%-5d %-10s %-10s %-5d %-10d %-10d\n", 
                                  (i + 1), 
                                  inputKodeBarang[i], 
                                  namaBarang[index], 
                                  hargaBarang[index], 
                                  inputJumlahBeli[i], 
                                  jumlahBayar[i]);
                totalBayar += jumlahBayar[i];
            }
        }
        
        System.out.println("==============================");
        System.out.println("Total Bayar: " + totalBayar);
        System.out.print("Apakah anda ingin belanja lagi? (y/n): ");
            belanjaLagi = scanner.next();
            
        } while (belanjaLagi.equalsIgnoreCase("y"));

        System.out.println("Terima kasih sudah berbelanja di TOKO SERBA ADA!");
    }
    static int findIndex(String kode) {
        for (int i = 0; i < kodeBarang.length; i++) {
            if (kodeBarang[i].equals(kode)) {
                return i;
            }
        }
        return -1;
    }
}