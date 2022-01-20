import java.util.Scanner;

public class SayiSiralamasi {
    public static void main(String[] args) {
        int num1, num2, num3, a=1, b=2, c=3;
        byte selection;

        Scanner input = new Scanner( System.in );

        System.out.print( "Lütfen Birinci Sayıyı Giriniz : " );
        num1 = input.nextInt();
        System.out.print( "Lütfen İkinci Sayıyı Giriniz : " );
        num2 = input.nextInt();
        System.out.print( "Lütfen Üçüncü Sayıyı Giriniz : " );
        num3 = input.nextInt();

        if (( num1 > num2 ) && ( num1 > num3 )) {
            a = num1;
            if (num2 > num3) {
                b = num2;
                c = num3;
            } else {
                b = num3;
                c = num2;
            }
        } else if (( num2 > num1 ) && ( num2 > num3 )) {
            a = num2;
            if (num1 > num3) {
                b = num1;
                c = num3;
            } else {
                b = num3;
                c = num2;
            }
        } else {
            a = num3;
            if (num1 > num2) {
                b = num1;
                c = num2;
            } else {
                b = num2;
                c = num1;
            }
        }

        System.out.println("1. Büyükten Küçüğe Doğru Sırala\n2. Küçükten Büyüğe Doğru Sırala");
        selection = input.nextByte();

        if (selection == 1)
            System.out.println(a + "\n" + b + "\n" + c);
        else if (selection == 2)
            System.out.println(c + "\n" + b + "\n" + a);
        else
            System.out.println("Yanlış Bir Tercih Yaptınız");
    }
}
