package Overloading;

class Balok {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public Balok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = 1;  
    }

    public double volume() {
        return panjang * lebar * tinggi;
    }

    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}