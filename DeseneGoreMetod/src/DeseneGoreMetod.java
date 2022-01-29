import java.util.Scanner;
public class DeseneGoreMetod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int a = input.nextInt();
        Desen(a, 0 , true);

    }

    static int Desen(int a, int b, boolean c) {
        if (c) {
            if (a > 0) {
                System.out.print( a + ", " );
                b++;
                return Desen( a - 5, b, true );
            } else
                return Desen( a, b, false );
        }
        else{
                System.out.print(a + ", ");
                if (b>0){
                    b--;
                    return Desen( a+5, b, false );
                }
                else
                    return 0;
            }
        }
}
