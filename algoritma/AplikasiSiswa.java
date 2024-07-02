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
public class AplikasiSiswa {
    private static Siswa[] siswaArray = new Siswa[100];
    private static int jumlahSiswa = 0;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Siswa");
            System.out.println("2. Tampilkan Data Siswa");
            System.out.println("3. Cari Data Siswa Berdasarkan NIS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // clear the newline
            switch (pilihan) {
                case 1:
                    tambahDataSiswa();
                    break;
                case 2:
                    tampilkanDataSiswa();
                    break;
                case 3:
                    cariDataSiswa();
                    break;
                case 4:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
    private static void tambahDataSiswa() {
        System.out.print("Masukkan NIS: ");
        String nis = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        Siswa siswa = new Siswa(nis, nama, kelas, alamat);
        siswaArray[jumlahSiswa] = siswa;
        jumlahSiswa++;
        System.out.println("Data siswa berhasil ditambahkan.");
    }

    private static void tampilkanDataSiswa() {
        if (jumlahSiswa == 0) {
            System.out.println("Tidak ada data siswa.");
        } else {
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.println(siswaArray[i]);
            }
        }
    }
    private static void cariDataSiswa() {
        System.out.print("Masukkan NIS yang dicari: ");
        String nis = scanner.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < jumlahSiswa; i++) {
            if (siswaArray[i].getNis().equals(nis)) {
                System.out.println("Data Siswa Ditemukan:");
                System.out.println(siswaArray[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data siswa dengan NIS " + nis + " tidak ditemukan.");
        }
    }
}