import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        short birthDay;
        int remain;
        String data;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        birthDay = input.nextShort();

        remain = (birthDay%12);

        switch (remain){
            case 0 :
                data = "Maymun"; break;
            case 1 :
                data = "Horoz"; break;
            case 2 :
                data = "Köpek"; break;
            case 3 :
                data = "Domuz"; break;
            case 4 :
                data = "Fare"; break;
            case 5 :
                data = "Öküz"; break;
            case 6 :
                data = "Kaplan"; break;
            case 7 :
                data = "Tavşan"; break;
            case 8 :
                data = "Ejderha"; break;
            case 9 :
                data = "Yılan"; break;
            case 10 :
                data = "At"; break;
            case 11 :
                data = "Koyun"; break;
            default :
                data = "Yanlış Giriş Yaptınız";
        }
        System.out.println("Çin Zodyağı Burcunuz : " + data);
    }
}
