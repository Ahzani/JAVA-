import java.util.Scanner;
public class BalikkanString {
    public static void stringReverse(char[] arr, int index) {
        if (index >= 0) {
            System.out.print(arr[index]);
            stringReverse(arr, index - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String input = scan.nextLine();
        char[] data = input.toCharArray();

        System.out.println("String yang dibalik dengan rekursif:");
        stringReverse(data, data.length - 1);
    }
}
