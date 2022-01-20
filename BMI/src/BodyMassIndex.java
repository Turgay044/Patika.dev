import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        float boy;
        short kilo;
        double sonuc;

        Scanner girdi = new Scanner( System.in );
        System.out.print("Lütfen Boy Uzunluğunuzu Metre Olarak Giriniz : ");
        boy = girdi.nextFloat();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = girdi.nextShort();

        sonuc = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz : " + sonuc + " dir.");
        }
}
