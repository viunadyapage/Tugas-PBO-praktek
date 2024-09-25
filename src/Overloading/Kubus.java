package Overloading;

class Kubus {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public Kubus() {
        this.sisi = 1;  
    }

    public double volume() {
        return sisi * sisi * sisi;
    }

    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }
}
