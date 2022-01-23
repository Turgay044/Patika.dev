import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int a;
        double b=0, i = 1;
        Scanner input = new Scanner( System.in );

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        a = input.nextInt();

        for (; i<=a; i++){
            b += 1/i;
        }
        System.out.println(b);
    }
}
