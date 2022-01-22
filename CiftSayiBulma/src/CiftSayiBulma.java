import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int a=0,b=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lüften Başlangıç Sayısını Giriniz : ");
        a = input.nextInt();
        System.out.print("Lütfen Bitiş Sayısını Giriniz : ");
        b = input.nextInt();

        for (int i = a; i<=b; i++){
            if (i%2 ==0)
                System.out.print(i + ", ");
        }
    }
}
