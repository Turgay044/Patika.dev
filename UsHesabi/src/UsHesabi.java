import java.util.Scanner;
public class UsHesabi {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Taban Sayısını Giriniz : ");
        a = input.nextInt();
        System.out.print("Lütfen Üs Sayısını Giriniz : ");
        b = input.nextInt();
        System.out.println("Üs İşleminin Sonucu : " + usdeger(a,b));
    }

    static int usdeger (int a, int b){
        if (b==0)
            return 1;
        else
        return a * usdeger(a,b-1);
    }
}
