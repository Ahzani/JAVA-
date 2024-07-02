import java.util.Scanner;
public class AngsuranLaptop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Memasukkan harga laptop
        System.out.print("Masukkan harga laptop: ");
        double hargaLaptop = scanner.nextDouble();
        // Memasukkan jumlah bulan angsuran
        System.out.print("Masukkan jumlah bulan angsuran (3, 6, atau 12): ");
        int bulan = scanner.nextInt();
        // Menghitung total angsuran
        if (hargaLaptop >= 20000000) {
            hitungAngsuran(hargaLaptop, bulan, 0.005, 0.01, 0.02);
        } else if (hargaLaptop >= 5000000) {
            hitungAngsuran(hargaLaptop, bulan, 0.005, 0.01, 0.02);
        } else {
            System.out.println("Harga laptop kurang dari 5.000.000, harus dibayar cash dan tidak dapat diangsur.");
        }
        scanner.close();
    }
    public static void hitungAngsuran(double hargaLaptop, int bulan, double bunga3Bulan, double bunga6Bulan, double bunga12Bulan) {
        double totalAngsuran = 0;
        switch (bulan) {
            case 3:
                totalAngsuran = (hargaLaptop / 3) + (hargaLaptop * bunga3Bulan);
                System.out.println("Total angsuran per bulan selama 3 bulan: " + totalAngsuran);
                break;
            case 6:
                totalAngsuran = (hargaLaptop / 6) + (hargaLaptop * bunga6Bulan);
                System.out.println("Total angsuran per bulan selama 6 bulan: " + totalAngsuran);
                break;
            case 12:
                totalAngsuran = (hargaLaptop / 12) + (hargaLaptop * bunga12Bulan);
                System.out.println("Total angsuran per bulan selama 12 bulan: " + totalAngsuran);
                break;
            default:
                System.out.println("Salah masukan bulan");
                break;
        }
    }
}
