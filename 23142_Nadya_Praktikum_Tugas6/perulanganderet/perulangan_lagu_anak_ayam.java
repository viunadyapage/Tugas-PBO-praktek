package perulanganderet;


public class perulangan_lagu_anak_ayam {
    public static void main(String[] args) {
        System.out.println("Bilangan Prima dari 0 sampai 20:");
        for (int i = 2; i <= 20; i++) {
            if (cekPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan Bukan Prima dari 0 sampai 20:");
        for (int i = 0; i <= 20; i++) {
            if (!cekPrima(i) && i > 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nBilangan Genap dari 0 sampai 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nBilangan Ganjil dari 0 sampai 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nDeret Huruf dari Z ke A:");
        for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
            System.out.print(huruf + " ");
        }

        System.out.println("\n\nLagu Anak Ayam Turun N:");
        int n = 10; 
        for (int i = n; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            }
        }
    }

    public static boolean cekPrima(int angka) {
        if (angka <= 1) return false;
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) return false;
        }
        return true;
    }
}