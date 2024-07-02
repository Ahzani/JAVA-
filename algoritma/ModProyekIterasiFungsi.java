import java.util.Scanner;
public class ModProyekIterasiFungsi {
    public static void cetakUlang(int nUlang) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nUlang; i++) {
            System.out.print("Masukkan kalimat ke-" + (i + 1) + ": ");
            String kalimat = scan.nextLine();
            System.out.println("Cetak: " + kalimat);
        }
    }
    public static void main(String[] args) {
        int nUlang;
        Scanner scan = new Scanner(System.in);
        System.out.print("Akan dicetak berapa kali? ");
        nUlang = scan.nextInt();
        cetakUlang(nUlang);
    }
}
