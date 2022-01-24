import java.util.Scanner;

public class MukkemmelSayi {
    public static void main(String[] args) {
        int a,b=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        a = input.nextInt();

        for (int i = 1; i < a; i++){
            if (a % i == 0)
                b += i;
        }
        if (b==a)
            System.out.print(a + " Sayısı Mükemmel Bir Sayıdır...");
        else
            System.out.print(a + " Sayısı Mükemmel Bir Sayı Değildir...");
    }
}
