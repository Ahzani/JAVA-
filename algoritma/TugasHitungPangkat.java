import java.util.Scanner;
public class TugasHitungPangkat {
    public static int pangkat(int A, int B) {
        int hasil = 1;
        for (int i = 1; i <= B; i++) {
            hasil *= A;
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai A (bilangan bulat >= 1): ");
        int A = scan.nextInt();
        System.out.print("Masukkan nilai B (bilangan bulat >= 1): ");
        int B = scan.nextInt();

        int hasil = pangkat(A, B);

        System.out.println("Hasil dari " + A + "^" + B + " adalah: " + hasil);
    }
}
