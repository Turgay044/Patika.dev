import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        byte day, month;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Doğum Gününüzü Giriniz : ");
        day = input.nextByte();
        System.out.println("Lütfen Doğduğunuz Ayı Giriniz");
        System.out.println("1. Ocak\n2. Şubat\n3. Mart\n4. Nisan\n5. Mayıs\n6. Haziran\n7. Temmuz\n8. Ağustos\n9. Eylül\n10. Ekim\n11. Kasım\n12. Aralık");
        month = input.nextByte();

        if ((day >= 21 && day <= 31 && month==3) || (day >= 1 && day <= 20 && month==4)){
            System.out.print("Koç Burcundansınız...");
        }
        else if ((day >= 21 && day <= 30 && month==4) || (day >= 1 && day <= 21 && month==5)){
            System.out.print("Boğa Burcundansınız...");
        }
        else if ((day >= 22 && day <= 31 && month==5) || (day >= 1 && day <= 22 && month==6)){
            System.out.print("İkizler Burcundansınız...");
        }
        else if ((day >= 23 && day <= 30 && month==6) || (day >= 1 && day <= 22 && month==7)){
            System.out.print("Yengeç Burcundansınız...");
        }
        else if ((day >= 23 && day <= 31 && month==7) || (day >= 1 && day <= 22 && month==8)){
            System.out.print("Aslan Burcundansınız...");
        }
        else if ((day >= 23 && day <= 31 && month==8) || (day >= 1 && day <= 22 && month==9)){
            System.out.print("Başak Burcundansınız...");
        }
        else if ((day >= 23 && day <= 30 && month==9) || (day >= 1 && day <= 22 && month==10)){
            System.out.print("Terazi Burcundansınız...");
        }
        else if ((day >= 23 && day <= 31 && month==10) || (day >= 1 && day <= 21 && month==11)){
            System.out.print("Akrep Burcundansınız...");
        }
        else if ((day >= 22 && day <= 30 && month==11) || (day >= 1 && day <= 21 && month==12)){
            System.out.print("Yay Burcundansınız...");
        }
        else if ((day >= 22 && day <= 31 && month==12) || (day >= 1 && day <= 21 && month==1)){
            System.out.print("Oğlak Burcundansınız...");
        }
        else if ((day >= 22 && day <= 31 && month==1) || (day >= 1 && day <= 19 && month==2)){
            System.out.print("Kova Burcundansınız...");
        }
        else if ((day >= 20 && day <= 28 && month==2) || (day >= 1 && day <= 20 && month==3)){
            System.out.print("Balık Burcundansınız...");
        }
        else
            System.out.println("Yanlış Bir Tarih Girdiniz...");
    }
}
