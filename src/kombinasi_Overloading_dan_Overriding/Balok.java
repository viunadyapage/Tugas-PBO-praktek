package kombinasi_Overloading_dan_Overriding;

class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public Balok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = 1; // Default tinggi = 1
    }

    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
