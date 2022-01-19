import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;
        byte way;

        Scanner input = new Scanner( System.in );

        System.out.print("Lütfen Hava Sıcaklığını Giriniz : ");
        heat = input.nextInt();

        System.out.println("1-While\n2-if");
        way = input.nextByte();

        if (way ==1) {
            while (heat<5){
                System.out.print("Kayak Sporu Önerilir..");
                break;
            }
            while (heat>=5 && heat<=15) {
                System.out.println( "Sinemaya Gitmenizi Önerilir..." );
                break;
            }
            while (heat>=15 && heat<=25) {
                System.out.println( "Piknik Yapmanızı Öneririz..." );
                break;
            }
            while  (heat>=25) {
                System.out.println( "Yüzme Sporunu Yapmanızı Öneririz..." );
                break;
            }
        }
        else if (way==2) {
            if(heat<5)
                System.out.print("Kayak Sporu Önerilir..");
            if (heat>=5 && heat<=15)
                System.out.println( "Sinemaya Gitmenizi Önerilir..." );
            if (heat>=15 && heat<=25)
                System.out.println( "Piknik Yapmanızı Öneririz..." );
            if (heat>=25)
                System.out.println( "Yüzme Sporunu Yapmanızı Öneririz..." );
        }
        else
            System.out.print("Yalnış Bir Tercih Yaptınız...");
    }
}
