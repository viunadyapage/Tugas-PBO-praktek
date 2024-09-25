package kombinasi_Overloading_dan_Overriding;

public class MainPolimorfisme {
    public static void main(String[] args) {
        BangunRuang balok1 = new Balok(3, 4, 5);
        BangunRuang balok2 = new Balok(3, 4); // tinggi default 1
        BangunRuang kubus1 = new Kubus(3);
        BangunRuang kubus2 = new Kubus(); // sisi default 1

        System.out.println("Balok dengan 3 parameter (3x4x5):");
        System.out.println("Volume: " + balok1.volume());
        System.out.println("Luas Permukaan: " + balok1.luasPermukaan());

        System.out.println("\nBalok dengan 2 parameter (3x4x1):");
        System.out.println("Volume: " + balok2.volume());
        System.out.println("Luas Permukaan: " + balok2.luasPermukaan());

        System.out.println("\nKubus dengan 1 parameter (3):");
        System.out.println("Volume: " + kubus1.volume());
        System.out.println("Luas Permukaan: " + kubus1.luasPermukaan());

        System.out.println("\nKubus default dengan 1 parameter (1):");
        System.out.println("Volume: " + kubus2.volume());
        System.out.println("Luas Permukaan: " + kubus2.luasPermukaan());
    }
}
