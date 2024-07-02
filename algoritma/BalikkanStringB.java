import java.util.Scanner;
public class BalikkanStringB {
    public static void stringReverseIterative(char[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String input = scan.nextLine();
        char[] data = input.toCharArray();

        System.out.println("String yang dibalik dengan iterasi:");
        stringReverseIterative(data);
    }
}
