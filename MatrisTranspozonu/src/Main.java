import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.print("Lütfen Matriksin Satır Sayısını Giriniz : ");
        int satir = s.nextInt();
        System.out.print("Lütfen Matriksin Sütun Sayısını Giriniz : ");
        int sutun = s.nextInt();
        int matriks[][] = new int[satir][sutun];
        System.out.println("Hadi Matriksi Oluşturalım :");
        for(i = 0; i < satir; i++)
        {
            for(j = 0; j < sutun; j++)
            {
                System.out.print(i + ". Satırın " + j + ". Sütunun Elemanını Giriniz : ");
                matriks[i][j] = s.nextInt();
            }
        }
        System.out.println("Matris : ");
        for(i = 0; i < satir; i++)
        {
            for(j = 0; j < sutun; j++)
            {
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Transpoze : ");
        for(i = 0; i < sutun; i++)
        {
            for(j = 0; j < satir; j++)
            {
                System.out.print(matriks[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
