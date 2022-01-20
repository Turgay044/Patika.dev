import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        byte armut, elma, domates, muz, patlican;

        Scanner veri = new Scanner( System.in );

        System.out.print("Kaç Kilo Armut Aldınız ? : ");
        armut = veri.nextByte();
        System.out.print("Kaç Kilo Elma Aldınız ? : ");
        elma = veri.nextByte();
        System.out.print("Kaç Kilo Domates Aldınız ? : ");
        domates = veri.nextByte();
        System.out.print("Kaç Kilo Muz Aldınız ? : ");
        muz = veri.nextByte();
        System.out.print("Kaç Kilo Patlıcan Aldınız ? : ");
        patlican = veri.nextByte();

        System.out.println();
        System.out.print("Toplam Tutar = " + ((armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.0)) + " TL'dir.");
    }
}
