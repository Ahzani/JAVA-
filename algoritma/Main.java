import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        System.out.println("List sebelum disortir: " + list);

        Collections.sort(list);

        System.out.println("List setelah disortir: " + list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toUpperCase());
        }
        System.out.println("List setelah diubah menjadi huruf besar: " + list);

        double number = 25;
        double sqrt = Math.sqrt(number);
        double pow = Math.pow(number, 2);

        System.out.println("Akar kuadrat dari " + number + " adalah " + sqrt);
        System.out.println(number + " pangkat 2 adalah " + pow);
    }
}
