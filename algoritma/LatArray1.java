import java.util.Scanner;
public class LatArray1 {
    public static void printArrayIterative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + arr[i]);
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
        System.out.println("Menampilkan elemen array dengan iterasi:");
        printArrayIterative(data);
    }
}
