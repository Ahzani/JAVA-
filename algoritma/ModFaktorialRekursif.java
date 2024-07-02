public class ModFaktorialRekursif {
    // Method untuk menghitung faktorial secara rekursif dan mencetak setiap langkah
    public static long faktorial(long N) {
        if (N <= 1) { // kondisi terpenuhi untuk akhir rekursif
            System.out.println("Faktorial " + N + " = 1");
            return 1; // nilai akhir: 0! = 1 dan 1! = 1
        } else { // step rekursif, ada pemanggilan kembali method 'faktorial'
            long result = N * faktorial(N - 1);
            System.out.println("Faktorial " + N + " = " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        // pemanggilan awal method faktorial
        faktorial(5);
    }
}
