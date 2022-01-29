import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        int a, num1 = 1, num2 = 1;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println("1- Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme işlemi\n5- Üslü Sayı Hesaplama\n6- Faktoriyel Hesaplama\n7- Mod Alma\n8- Dikdörtgen Alan ve Çevre Hesabı\n0- Çıkış Yap");
            System.out.print("Lütfen Bir İşlem Seçiniz : ");
            a = input.nextInt();
            if (a!=0){
                System.out.print("Lütfen İşlem Yapılacak İlk Sayıyı Giriniz : ");
                num1 = input.nextInt();
                System.out.print("Lütfen İşlem Yapılacak İkinci Sayıyı Giriniz : ");
                num2 = input.nextInt();
            }
            for (int i = 0; i<=80; i++)
                System.out.print("*");
            System.out.println("");
            switch (a) {
                case 0:
                    int d=2;
                    do{
                        System.out.print("Çıkmak İstediğinizden Emin Misin ?\n1- Evet\n2- Hayır\n Seçiminiz : ");
                        d = input.nextInt();
                        switch (d){
                            case 1 :d=2; break;
                            case 2 : a=1; break;
                            default : System.out.println( "Yanlış Bir Rakam Girdiniz, Lütfen Tekrar Deneyiniz..." );
                        }
                    }while(d!=2);
                    break;
                case 1:
                    System.out.println( num1 + " ile " + num2 + " Toplama İşleminin Sonucu : " + toplama( num1, num2 ) + " 'dir." );
                    break;
                case 2:
                    System.out.println( num1 + " ile " + num2 + " Çıkartma İşleminin Sonucu : " + cikarma( num1, num2 ) + " 'dir." );
                    break;
                case 3:
                    System.out.println( num1 + " ile " + num2 + " Çarpma İşleminin Sonucu : " + carpma( num1, num2 ) + " 'dir." );
                    break;
                case 4:
                    if (num2==0)
                        System.out.println("İkinci Sayı Sıfır Olamaz...");
                    else
                    System.out.println( num1 + " ile " + num2 + " Bölme İşleminin Sonucu : " + bolme( num1, num2 ) + " 'dir." );
                    break;
                case 5:
                    System.out.println( num1 + " ile " + num2 + " Üslü İşleminin Sonucu : " + uslu( num1, num2 ) + " 'dir." );
                    break;
                case 6:
                    System.out.println( num1 + " 'in Faktöriyel İşleminin Sonucu : " + faktoriyel( num1 ) + " 'dir." );
                    System.out.println( num2 + " 'in Faktöriyel İşleminin Sonucu : " + faktoriyel( num2 ) + " 'dir." );
                    break;
                case 7:
                    System.out.println( num1 + " ile " + num2 + " Mod İşleminin Sonucu : " + mod( num1, num2 ) + " 'dir." );
                    break;
                case 8:
                    System.out.println( num1 + " ile " + num2 + " DikDörtgenin Çevre İşleminin Sonucu : " + dikcevre( num1, num2 ) + " 'dir." );
                    System.out.println( num1 + " ile " + num2 + " DikDörtgenin Alan İşleminin Sonucu : " + dikalan( num1, num2 ) + " 'dir." );
                    break;
                default:
                    System.out.println( "Yanlış Bir Rakam Girdiniz, Lütfen Tekrar Deneyiniz..." );
            }
        }while (a!=0);
    }


    static int toplama (int a, int b){
        return a + b;
    }

    static int cikarma (int a, int b){
        return a - b;
    }

    static int carpma (int a, int b){
        return a * b;
    }

    static int bolme (int a, int b){
        return a / b;
    }

    static int uslu (int a, int b){
        return (int) Math.pow(a,b);
    }

    static int faktoriyel (int a){
        int b = 1;
        for (int i = 1; i<=a; b *= i++);
        return b;
    }

    static int mod (int a, int b){
        return a % b;
    }

    static int dikcevre (int a, int b){
        return 2*(a+b);
    }

    static int dikalan (int a, int b){
        return a*b;
    }
}
