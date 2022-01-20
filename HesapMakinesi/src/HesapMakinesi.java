import com.sun.jdi.request.ExceptionRequest;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int num1, num2,arithmeticOperator;

        Scanner input = new Scanner( System.in );

        System.out.print("Birinci Sayıyı Giriniz : ");
        num1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        num2 = input.nextInt();

        System.out.println("Lütfen İşleminizi Seçiniz : ");
        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme\n5-Kalan\n0-Çıkış");
        System.out.print("Lütfen Seçiminizi Yazınız : ");

        arithmeticOperator = input.nextInt();

        switch (arithmeticOperator){
            case 0 :
                break;
            case 1 :
                System.out.println("Toplama işlemininiz Sonucu : " + (num1+num2));
                break;
            case 2 :
                System.out.println("Çıkartma işlemininiz Sonucu : " + (num1-num2));
                break;
            case 3 :
                System.out.println("Çarpma işlemininiz Sonucu : " + (num1*num2));
                break;
            case 4 :
                if (num2 == 0)
                    System.out.println("Bölen Sıfır Olamaz");
                else
                    System.out.println("Bölme işlemininiz Sonucu : " + (num1/num2));
                break;
            case 5 :
                if (num2 == 0)
                    System.out.println("Bölen Sıfır Olamaz");
                else
                    System.out.println("Bölmeden Kalan işlemininiz Sonucu : " + (num1%num2));
                break;
            default:
                System.out.print("Yanlış Bir Tuşa bastınız");
        }
    }
}
