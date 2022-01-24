import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int num1,num2, myNumber, i=1, ebob=1, ekok=1;

        Scanner input = new Scanner( System.in );
        System.out.print("Lütfen Birinci Sayıyı Giriniz : ");
        num1 = input.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz : ");
        num2 = input.nextInt();

        if (num1<num2)
            myNumber = num1;
        else
            myNumber = num2;

        while(i<=myNumber){
            if(num1%i==0 && num2%i==0){
                ebob = i;
            }
            i++;
        }

        while(myNumber>=1){
            if(num1%myNumber==0 & num2%myNumber==0){
                ebob=myNumber;
                break;
            }
            myNumber--;
        }

        while(i<=(num1*num2)){
            if(i%num1==0 && i%num2==0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println(num1 + " ve " + num2 + " Sayılarının EBOB'ları " + ebob + " 'dır...");
        System.out.println(num1 + " ve " + num2 + " Sayılarının EKOK'ları " + ekok + " 'dır...");
    }
}
