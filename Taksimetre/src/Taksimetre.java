import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        short mesafe, sabitMesafe = 20;
        float uzunMesafe;
        Scanner veri = new Scanner( System.in );

        System.out.print("Gideceğiniz Km mesafesini Yazın : ");
        mesafe = veri.nextShort();

        uzunMesafe = 10 + (mesafe * 2.2f);
        float ucret = mesafe<5 ? sabitMesafe : uzunMesafe;

        System.out.println("Ödenecek Miktar = " + ucret + " TL'dir.");
    }
}
