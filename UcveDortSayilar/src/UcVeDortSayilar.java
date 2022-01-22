import java.util.Scanner;

public class UcVeDortSayilar {
    public static void main(String[] args) {
        int a, b=0;
        double c=0, average;
        Scanner input = new Scanner( System.in );

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        a = input.nextInt();

        for (int i = 1; i<=a; i++){
            if ((i%3 == 0) && (i%4 ==0)){
                c += i;
                b++;
            }
        }
        average = c/b;
        System.out.println(average);
    }
}
