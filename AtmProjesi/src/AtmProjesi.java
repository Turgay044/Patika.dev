import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        int balance = 1500;
        byte tries=3, selection;
        Scanner input = new Scanner( System.in );

        while (tries >0){
            System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
            userName = input.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println( "Merhaba, ATM Bankamatiğine HoşGeldiniz..." );
                boolean a = true;
                while(a){
                    System.out.print("1. Para Yatırma\n2. Para Çekme\n3. Bakiye Sorgula\n4. Çıkış\nLütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    selection = input.nextByte();

                    switch (selection){
                        case 1 :
                            System.out.print("Lütfen Yatıracağınız Para Miktarını Giriniz : ");
                            int amount = input.nextInt();
                            balance += amount;
                            System.out.println("Hesap Özetiniz : " + balance);
                            break;
                        case 2 :
                            System.out.print("Lütfen Çekeceğiniz Para Miktarını Giriniz : ");
                            int amount1 = input.nextInt();
                            if (amount1 > balance)
                                System.out.println("Yetersiz Bakiye...");
                            else{
                                balance -= amount1;
                                System.out.println("Kalan Bakiyeniz : " + balance);
                            }
                            break;
                        case 3 :
                            System.out.println("Heabınızdaki Bakiyeniz : " + balance);
                            break;
                        case 4 :
                            System.out.println("Başarıyla Çıkış Yaptınız...");
                            a = false;
                            break;
                        default :
                            System.out.println("Yanlış Bir Tuşa Bastınız. Lütfen Tekrar Deneyiniz...");
                            break;
                    }
                }
            break;
            }
            else{
                tries--;
                if (tries == 0)
                    System.out.println("3 Kere Hatalı Giriş Yaptınız.\nHesabınız Bloke Olmuştur. Lütfen Bankanız ile İletişime Geçiniz...");
                else{
                    System.out.println("Hatalı Kullanıcı Adı ve Şifre Girdiniz. Lütfen Tekrar Deneyiniz...");
                    System.out.println("Kalan Hakkınız : " + tries);
                }
            }

        }
    }
}
