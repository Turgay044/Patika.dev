import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int i=1, request, num1=0,num2=1,num3;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        request = input.nextInt();

        while(i<=request){
            System.out.print(num1+", ");
            num3=num1+num2;
            num1=num2;
            num2=num3;
            i++;
        }
    }
}
