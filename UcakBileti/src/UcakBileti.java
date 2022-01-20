import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int distance, age, flyingType;
        double ticketPrice;

        Scanner input = new Scanner( System.in );

        System.out.print( "Mesafeyi km türünden giriniz : " );
        distance = input.nextInt();
        System.out.print( "Yaşınızı giriniz : " );
        age = input.nextInt();
        System.out.println( "Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): " );
        flyingType = input.nextInt();

        if (distance < 1 || age < 1 || age > 150 || flyingType < 1 || flyingType > 2)
            System.out.println( "Hatalı Veri Girdiniz !" );
        else {
             ticketPrice = distance * 0.10;

            if (age < 12)
                ticketPrice -= ( ticketPrice * 0.50 );
            if (age >= 12 && age <= 24)
                ticketPrice -= ( ticketPrice * 0.10 );
            if (age > 65)
                ticketPrice = ( ticketPrice * 0.30 );
            if (flyingType == 2) {
                ticketPrice -= ( ticketPrice * 0.20 );
                ticketPrice *= 2;
            }
            System.out.println( "Toplam Tutar = " + ticketPrice + " TL" );
        }
    }
}
