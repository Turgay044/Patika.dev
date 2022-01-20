import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner( System.in );

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz : ");
        password = input.nextLine();

        String basari = (userName.equals( "Turgay" ) && password.equals( "storm044" )) ? "Girişiniz Başarılıdır" : "Lütfen Tekrar Deneyiniz...";
        System.out.println(basari);
    }
}
