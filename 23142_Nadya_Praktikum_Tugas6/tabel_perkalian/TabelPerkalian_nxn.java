package tabel_perkalian;

import java.util.Scanner;

public class TabelPerkalian_nxn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();

        if (n > 10 || n < 1) {
            System.out.println("Nilai n harus antara 1 dan 10.");
            return;
        }

        System.out.print("\t");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t"); 
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}