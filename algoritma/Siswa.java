import java.util.Scanner;
class Siswa {
    private String nis;
    private String nama;
    private String kelas;
    private String alamat;
    public Siswa(String nis, String nama, String kelas, String alamat) {
        this.nis = nis;
        this.nama = nama;
        this.kelas = kelas;
        this.alamat = alamat;
    }
    public String getNis() {
        return nis;
    }
    public String getNama() {
        return nama;
    }
    public String getKelas() {
        return kelas;
    }
    public String getAlamat() {
        return alamat;
    }
    @Override
    public String toString() {
        return "NIS: " + nis + ", Nama: " + nama + ", Kelas: " + kelas + ", Alamat: " + alamat;
    }
}

