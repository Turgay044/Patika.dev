import java.util.Scanner;

public class MinMaxDegerler {
    public static void main(String[] args) {
        int a,b=1,c=0,min=0,max=0;


        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        a = input.nextInt();

        while(b!=(a+1)){
            System.out.print(b + ". Sayıyı Giriniz : ");
            c = input.nextInt();
            if (min==0 || c<min)
                min=c;
            if (max==0 || c>max)
                max=c;
            b++;
        }
        System.out.println("En Büyük Sayı = " + max);
        System.out.print("En Küçük Sayı = " + min);
    }
}
