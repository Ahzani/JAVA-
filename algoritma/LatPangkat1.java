public class LatPangkat1 {
    // Method rekursif untuk menghitung A^B
    public static long pangkat(long A, long B) {
        if (B == 0) {
            return 1; // Basis: A^0 = 1
        } else {
            return A * pangkat(A, B - 1); // Rekursif: A^B = A * A^(B-1)
        }
    }
    public static void main(String[] args) {
        // Contoh pemanggilan metode pangkat
        long A = 3;
        long B = 4;
        System.out.println(A + " pangkat " + B + " = " + pangkat(A, B));
    }
}
