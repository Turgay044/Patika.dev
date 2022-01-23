import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int a, b, c=1, d=1, e=1;
        double combination;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Küme Elemanlarının Sayısını Giriniz : ");
        a = input.nextInt();
        System.out.print("Lütfen Başka Bir Küme Elemanlarının Sayısını Giriniz : ");
        b = input.nextInt();

        for(int i=1 ; i<=a; i++) {
            c *= i;
        }
        for(int i=1 ; i<=b; i++) {
            d *= i;
        }
        for(int i=1 ; i<=(a-b); i++) {
            e *= i;
        }
        combination = c/(d*e);
        System.out.println(combination);
    }
}
