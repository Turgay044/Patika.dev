import java.util.Scanner;

public class TekSayilar {
    public static void main(String[] args) {
        int a, b=0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Lütfen Bir Sayı Giriniz : ");
            a = input.nextInt();
        }while (a%2 ==0);

        for (int i = 1; i<=a ; i++){
            if(i%2==0)
                b += i;
            if (i%4==0)
                b += i;
        }
        System.out.println(b);
    }
}
