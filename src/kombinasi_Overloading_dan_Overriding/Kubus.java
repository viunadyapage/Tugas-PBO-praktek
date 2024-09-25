package kombinasi_Overloading_dan_Overriding;

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public Kubus() {
        this.sisi = 1; // Default sisi = 1
    }

    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }
}
