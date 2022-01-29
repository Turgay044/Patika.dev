import java.util.Scanner;
public class AsalSayiRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int a = input.nextInt();

        if (asalsayi(2, a) == 0)
            System.out.print(a + " Bir Asal Sayıdır...");
        else
            System.out.print(a + " Bir Asal Sayı Değildir...");
    }

    static int asalsayi (int a, int b){
        if (a==b)
            return 0;
        else if (b%a==0)
            return 1;
        else
            return asalsayi( a+1, b );
    }
}
