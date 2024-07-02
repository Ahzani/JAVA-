import java.util.Scanner;
public class Kalkulator {
    public static double tambah(double a, double b) {
        return a + b;
    }
    public static double kurang(double a, double b) {
        return a - b;
    }
    public static double kali(double a, double b) {
        return a * b;
    }
    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return Double.NaN;
        }
        return a / b;
    }
    public static double rataRata(double[] data) {
        double total = 0;
        for (double num : data) {
            total += num;
        }
        return total / data.length;
    }
    public static double maksimum(double[] data) {
        double max = data[0];
        for (double num : data) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static double minimum(double[] data) {
        double min = data[0];
        for (double num : data) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Aritmatika");
            System.out.println("2. Statistik");
            System.out.println("3. Keluar");
            int pilihan = scanner.nextInt();
            if (pilihan == 1) {
                System.out.println("Pilih operasi aritmatika:");
                System.out.println("1. Penjumlahan");
                System.out.println("2. Pengurangan");
                System.out.println("3. Perkalian");
                System.out.println("4. Pembagian");
                int operasi = scanner.nextInt();
                System.out.print("Masukkan angka pertama: ");
                double a = scanner.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                double b = scanner.nextDouble();
                double hasil = 0;
                switch (operasi) {
                    case 1:
                        hasil = tambah(a, b);
                        break;
                    case 2:
                        hasil = kurang(a, b);
                        break;
                    case 3:
                        hasil = kali(a, b);
                        break;
                    case 4:
                        hasil = bagi(a, b);
                        break;
                    default:
                        System.out.println("Operasi tidak valid.");
                        continue;
                }
                System.out.println("Hasil: " + hasil);

            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah elemen: ");
                int n = scanner.nextInt();
                double[] data = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
                    data[i] = scanner.nextDouble();
                }
                System.out.println("Pilih operasi statistik:");
                System.out.println("1. Rata-rata");
                System.out.println("2. Nilai maksimum");
                System.out.println("3. Nilai minimum");
                int operasi = scanner.nextInt();
                double hasil = 0;
                switch (operasi) {
                    case 1:
                        hasil = rataRata(data);
                        break;
                    case 2:
                        hasil = maksimum(data);
                        break;
                    case 3:
                        hasil = minimum(data);
                        break;
                    default:
                        System.out.println("Operasi tidak valid.");
                        continue;
                }
                System.out.println("Hasil: " + hasil);
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}






