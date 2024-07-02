public class GCDRekursif {
    // Method rekursif untuk menghitung GCD
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x; // Basis: jika y adalah 0, maka gcd(x, y) adalah x
        } else {
            return gcd(y, x % y); // Rekursif: gcd(x, y) adalah gcd(y, x % y)
        }
    }
    public static void main(String[] args) {
        // Contoh pemanggilan metode gcd
        int x = 48;
        int y = 18;
        System.out.println("GCD dari " + x + " dan " + y + " adalah " + gcd(x, y));
    }
}
