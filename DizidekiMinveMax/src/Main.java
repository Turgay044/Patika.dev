import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        Scanner giris = new Scanner( System.in );
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int sayi = giris.nextInt();
        int kucuk=0, buyuk=0;
        Arrays.sort( dizi );

        System.out.println(Arrays.toString(dizi));
        if (sayi > dizi[0] && sayi<dizi[dizi.length-1])
        {
            for (int i = 0; i<dizi.length;i++){
                if (sayi<dizi[i]){
                    kucuk = dizi[i-1];
                    buyuk = dizi[i];
                    break;
                }
            }
            System.out.println(sayi + " 'nın Dizideki Bir Önceki Sayı = "+ kucuk);
            System.out.println(sayi + " 'nın Dizideki Bir Sonraki Sayı = "+ buyuk);
        }
        else
            System.out.println( sayi + " Sayısı Dizinin Dışındaki bir Değere Sahiptir. Lütfen Tekrar Deneyiniz..." );
    }
}
