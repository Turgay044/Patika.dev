import java.util.Scanner;

public class PalindromSayi {

    static String palindrom(String num2){
        StringBuilder lastNum = new StringBuilder();
        lastNum.append(num2);
        lastNum.reverse();
        if (lastNum.toString().equals(num2))
            System.out.print( "Bu Bir Palindrom Sayıdır..." );
        else
            System.out.print("Bu Bir Palindrom Sayı Değildir...");
        return "";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int num1 = input.nextInt();
        String num2 = Integer.toString(num1);
        palindrom(num2);
    }
}
