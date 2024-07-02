import java.util.Scanner;
public class ModProyekHitungJumlah {
    public static int hitungJumlah(int[] x) {
        int jum = 0;
        for (int i = 0; i < x.length; i++) {
            jum += x[i];
        }
        return jum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = scan.nextInt();
        int[] data = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = scan.nextInt();
        }
        int jumlah = hitungJumlah(data);
        System.out.println("Jumlah data = " + jumlah);
    }
}
