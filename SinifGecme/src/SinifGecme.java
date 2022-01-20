import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int math, phys, turk, chem, mus;
        double aver;
        String schoolYear = "";

        Scanner input = new Scanner( System.in );

        System.out.print("Lütfen Matematik Notunuzu Giriniz : ");
        math = input.nextInt();
        while ((math < 0) || (math >100)){
            System.out.print("Yalnış Not Girdiniz. Not Aralığınız 0-100 Arası Olmalıdır. Lütfen Tekrar Deneyiniz: ");
            math = input.nextInt();
        }

        System.out.print("Lütfen Fizik Notunuzu Giriniz : ");
        phys = input.nextInt();
        while ((phys < 0) || (phys >100)){
            System.out.print("Yalnış Not Girdiniz. Not Aralığınız 0-100 Arası Olmalıdır. Lütfen Tekrar Deneyiniz: ");
            phys = input.nextInt();
        }

        System.out.print("Lütfen Türkçe Notunuzu Giriniz : ");
        turk = input.nextInt();
        while ((turk < 0) || (turk >100)){
            System.out.print("Yalnış Not Girdiniz. Not Aralığınız 0-100 Arası Olmalıdır. Lütfen Tekrar Deneyiniz: ");
            turk = input.nextInt();
        }

        System.out.print("Lütfen Kimya Notunuzu Giriniz : ");
        chem = input.nextInt();
        while ((chem < 0) || (chem >100)){
            System.out.print("Yalnış Not Girdiniz. Not Aralığınız 0-100 Arası Olmalıdır. Lütfen Tekrar Deneyiniz: ");
            math = input.nextInt();
        }

        System.out.print("Lütfen Müzik Notunuzu Giriniz : ");
        mus = input.nextInt();
        while ((mus < 0) || (mus >100)){
            System.out.print("Yalnış Not Girdiniz. Not Aralığınız 0-100 Arası Olmalıdır. Lütfen Tekrar Deneyiniz: ");
            mus = input.nextInt();
        }

        aver = (math + phys + chem + turk + mus) / 5;

        schoolYear += ("Not Ortalamanız : " + aver + " 'dir.\n");
        schoolYear += (aver<=55) ? "Maalesef Sınıfta Kaldınız..." : "Tebrik Ederim, Sınıfı Geçtiniz...";

        System.out.print(schoolYear);
    }
}
