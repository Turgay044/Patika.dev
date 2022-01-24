import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        a = input.nextInt();

        for (int i=0; i<=a; i++){
            for (int m=1; m<=i; m++)
                System.out.print(" ");
            for (int n=0;n<2*(a-i)-1; n++)
                System.out.print("*");
            System.out.println();
        }
    }
    }
