import java.util.Scanner;
public class LatArray {
    public static void printArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println("Elemen ke-" + (index + 1) + ": " + arr[index]);
            printArray(arr, index + 1);
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
        System.out.println("Menampilkan elemen array dengan rekursif:");
        printArray(data, 0);
    }
}
