package pkg23142_nadya_praktikum_tugas;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String mataKuliah;
    private double nilai1;
    private double nilai2;
    private double nilai3;
    private double nilai4;
    private double nilai5;
    private double nilaiAkhir; // Tambahkan nilai akhir sebagai atribut

    public Mahasiswa(String nim, String nama, String alamat, String mataKuliah, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
        this.nilaiAkhir = hitungNilaiAkhir(); // Hitung nilai akhir saat konstruktor dipanggil
    }

    private double hitungNilaiAkhir() {
        return (nilai1 * 0.1) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
    }

    public double getNilaiAkhir() {
        return nilaiAkhir; // Ambil nilai akhir yang sudah dihitung
    }

    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getMataKuliah() { return mataKuliah; }
}