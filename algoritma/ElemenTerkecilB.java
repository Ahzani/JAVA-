import java.util.Scanner;
public class ElemenTerkecilB {
    public static int iterativeMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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
        int min = iterativeMinimum(data);
        System.out.println("Elemen terkecil dalam array adalah: " + min);
    }
}
