import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        int tutar;
        double kdv;
        Scanner veri = new Scanner(System.in);

        System.out.print("Lütfen Tutarınızı Giriniz : ");
        tutar = veri.nextInt();

        if (tutar>1000)
        {
            kdv = 0.18;
        }
        else
        {
            kdv = 0.08;
        }

        System.out.println("Mevcut Tutarınız : " + tutar);
        System.out.println("Tutarın Kdv'si : " + (tutar*kdv));
        System.out.print("Kdv'li Fiyat Toplamı : " + (tutar += (tutar*kdv)));
    }
}
