import java.util.Scanner;
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String input = scan.nextLine();
        boolean result = isPalindrome(input);
        if (result) {
            System.out.println("String tersebut adalah palindrome.");
        } else {
            System.out.println("String tersebut bukan palindrome.");
        }
    }
}
