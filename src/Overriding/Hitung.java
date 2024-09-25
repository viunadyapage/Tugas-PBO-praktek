package Overriding;

public class Hitung {

    public static void main(String[] args) {
        BangunRuang balok = new Balok(3, 4, 5);
        BangunRuang kubus = new Kubus(3);

        System.out.println("Balok:");
        System.out.println("Volume: " + balok.volume());
        System.out.println("Luas Permukaan: " + balok.luasPermukaan());

        System.out.println("\nKubus:");
        System.out.println("Volume: " + kubus.volume());
        System.out.println("Luas Permukaan: " + kubus.luasPermukaan());
    }
}

