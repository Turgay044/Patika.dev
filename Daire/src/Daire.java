import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        float pi = 3.14f , cevre, alan;
        short r;

        Scanner data = new Scanner( System.in );

        System.out.print("Lütfen Dairenin yarı Çapını Giriniz : ");
        r = data.nextByte();

        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.println("Dairenin Çevresi : " + cevre + " cm dir.\n" + "Dairenin Alanı : " + alan + " cm2 dir.");
    }
}
