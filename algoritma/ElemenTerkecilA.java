import java.util.Scanner;
public class ElemenTerkecilA {
    public static int recursiveMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            return Math.min(arr[n - 1], recursiveMinimum(arr, n - 1));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scan.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            data[i] = scan.nextInt();
        }
        int min = recursiveMinimum(data, n);
        System.out.println("Elemen terkecil dalam array adalah: " + min);
    }
}
