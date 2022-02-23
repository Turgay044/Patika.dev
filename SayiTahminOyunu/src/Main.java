import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random input = new Random();
        int ran = input.nextInt(100);
        int num=0;
        do{
            Scanner data = new Scanner( System.in );
            System.out.print("Lütfen Bir Sayı Giriniz : ");
            num = data.nextInt();
            if (num<0 || num>100)
                System.out.println("Lütfen 0-100 Arasında Bir Değer Giriniz...");
            else if (num<ran)
                System.out.println("Sayınız Hedef Saysının Altındadır. Lütfen Tekrar Deneyiniz...");
            else if (num>ran)
                System.out.println("Sayınız Hedef Saysının Üstündedir. Lütfen Tekrar Deneyiniz...");
        }while (num!=ran);
        System.out.println("Tebrikler, Bildiniz...");
    }
}
