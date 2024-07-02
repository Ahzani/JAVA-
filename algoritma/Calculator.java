import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.print("Masukkan angka pertama: ");
        num1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        num2 = input.nextDouble();
        System.out.print("Pilih operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        double result = calculate(num1, num2, operator);
        System.out.println("Hasil: " + result);
    }
    public static double calculate(double a, double b, char op) {
        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak valid.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
        }
        return result;
    }
}