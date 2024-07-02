import java.util.Scanner;
public class ProyekHitungRataRata {
    public static double hitungRataRata(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return (double) sum / x.length;
    }
    public static void main(String[] args) {
        int n = 10; // Jumlah data yang ingin dimasukkan
        int[] data = new int[n];
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan " + n + " bilangan:");
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = scan.nextInt();
        }

        double rataRata = hitungRataRata(data);
        System.out.println("Rata-rata data = " + rataRata);
    }
}
