import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Yıl Giriniz : ");
        year = input.nextInt();

        if (year<=0)
            System.out.print("Hatalı bir Yıl Girdiniz");
        else if (year%100==0 && year%400==0)
            System.out.println(year + " bir artık yıldır !");
        else if (year%100!=0 && year%4==0)
            System.out.println(year + " bir artık yıldır !");
        else
        System.out.println(year + " bir artık yıl değildir !");
        input.close();
        }
}

