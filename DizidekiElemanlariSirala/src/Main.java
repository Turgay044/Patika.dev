import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner giris = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        a = giris.nextInt();
        int[] liste = new int[a];

        for (int i=0; i<liste.length; i++){
            System.out.print((i+1) + ". Elemanı : ");
            int b = giris.nextInt();
            liste[i]=b;
        }
        Arrays.sort(liste);
        System.out.print(Arrays.toString(liste));
    }
}
