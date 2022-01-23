import java.util.Scanner;

public class UsKuvveti {
    public static void main(String[] args) {

        double a,b=0,c=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        a = input.nextInt();

        for (int i = 0 ; i < i+1; i++){
            b = Math.pow(4,i);
            c = Math.pow( 5,i );
            if (b<a){
                System.out.print(b + ", ");
            }
            else
                break;
            if (c<a){
                System.out.println(c + ", ");
            }
            else
                break;
        }
    }
}
