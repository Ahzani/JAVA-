import java.util.Scanner;
public class BubbleSort1{
public void bubbleSort(float larik2[]){
	int n = larik2.length;
	for (int i=0;i<larik2.length;i++){
		for (int elemen=0;elemen<larik2.length-1;elemen++){
			if (larik2[elemen]>larik2[elemen+1])
				tukar(larik2, elemen,elemen+1);
		}
		System.out.print("Langkah " + (i + 1) + ": ");
		for (int j = 0; j < n; j++) {
		          System.out.print(larik2[j] + " ");
		       }
            System.out.println();
		}
	}
public void tukar(float larik3[], int satu, int dua)
{
	float temp;
	temp = larik3[satu];
	larik3[satu] = larik3[dua];
	larik3[dua] = temp;
}
public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
	BubbleSort lrk = new BubbleSort();
	float nilai[]= new float[5];
	System.out.println("Masukan 5 buat data nilai");
	for (int i = 0; i < 5; i++)
	{
		System.out.print( (i + 1 )+" : ");
		nilai[i]=masuk.nextFloat();
	}
	System.out.println("Data nilai yang dimasukan");
	for (int i = 0; i < 5; i++)
		System.out.println(nilai[i]);

		System.out.println("Proses pengurutan:");
		lrk.bubbleSort(nilai);
        System.out.println();
	System.out.println("Data hasil pengurutan    ");
	lrk.bubbleSort(nilai);
	for (int i = 0; i < 5; i++)
		System.out.println(nilai[i]);
	}
}