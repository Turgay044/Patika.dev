import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        System.out.print("Lütfen Matematik Notunuzu Giriniz : ");
        byte matematik = veri.nextByte();
        System.out.print("Lütfen Fizik Notunuzu Giriniz : ");
        byte fizik = veri.nextByte();
        System.out.print("Lütfen Kimya Notunuzu Giriniz : ");
        byte kimya = veri.nextByte();
        System.out.print("Lütfen Türkçe Notunuzu Giriniz : ");
        byte turkce = veri.nextByte();
        System.out.print("Lütfen Tarih Notunuzu Giriniz : ");
        byte tarih = veri.nextByte();
        System.out.print("Lütfen Müzik Notunuzu Giriniz : ");
        byte muzik = veri.nextByte();

        float ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Not Ortalamanız : " + ortalama);

        String gecis = ortalama > 60 ? "Tebrikler, Geçtininiz..." : "Maalesef, Kaldınız!";
        System.out.print(gecis);

    }
}

