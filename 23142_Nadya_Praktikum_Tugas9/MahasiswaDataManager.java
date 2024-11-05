package pkg23142_nadya_praktikum_tugas;

import java.util.ArrayList;

public class MahasiswaDataManager {
    private ArrayList<Mahasiswa> mahasiswaList;

    public MahasiswaDataManager() {
        mahasiswaList = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
    }

    public void hapusMahasiswa(String nim) {
        mahasiswaList.removeIf(m -> m.getNim().equals(nim));
    }

    public ArrayList<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }
}