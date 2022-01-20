import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        short kenar1, kenar2;
        Scanner veri = new Scanner(System.in);

        // Hipotenüs
        System.out.print("Lütfen Üçgenin Birinci Kenar Uzunluğunu Giriniz : ");
        kenar1 = veri.nextShort();
        System.out.print("Lütfen Üçgenin İkinci Kenar Uzunluğunu Giriniz : ");
        kenar2 = veri.nextShort();
        double hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Dik Üçgenin Hipotenüs Uzunluğu = " + hipotenus + " cm'dir.");

        //Uzunluk
        System.out.println("Dik Üçgenin kenar uzunluğu = " + (kenar1 + kenar2 + hipotenus) + " cm'dir.");

        //Alan
        System.out.println("Dik Üçgenin alanı = " + ((kenar1 * kenar2) / 2) + " cm2'dir.");
    }
}
