import java.util.Scanner;

public class YildizlarlaElmas {
    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner( System.in );
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        a = input.nextInt();

        for (int i = 1; i<=a; i++){
            for (int j = 1; j<=a-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
            }

        for (int l = 1; l<=a-1; l++) {
            for (int j = 1; j <= l; j++) {
                System.out.print( " " );
            }
            for (int k = 1; k<=(2*a)-(2*l)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
