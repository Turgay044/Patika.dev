import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        int a, b, c=1;

        Scanner input = new Scanner( System.in );
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        a = input.nextInt();
        System.out.print("Lütfen Bir Üs Sayısını Giriniz : ");
        b = input.nextInt();

        for (int i = 1; i<=b; i++){
            c *= a;
        }
        System.out.println(a + " 'nın " + b + " kuvveti = " + c);
    }
}
