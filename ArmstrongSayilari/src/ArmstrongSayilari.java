import java.util.Scanner;

public class ArmstrongSayilari {
    public static void main(String[] args) {
        int a, c, d=0, e=0;
        String b;


        Scanner input = new Scanner( System.in );
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        a = input.nextInt();

        b= Integer.toString(a);
        c = b.length();

        for (int i=0 ; i<c;i++){
            d += Character.getNumericValue(b.charAt(i)) ;
        }
        System.out.print(d);
    }
}
