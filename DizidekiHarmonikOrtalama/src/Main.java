public class Main {
    public static void main(String[] args) {
        int[] dizi = {1,2,3,4,5,6,7,8};
        double toplam = 0;
        for (double sayi : dizi)
            toplam += 1.0/sayi;
        System.out.println(dizi.length/toplam);

    }
}
