public class Main {
    public static void main(String[] args) {
        int gorulen = -1;
        int[] dizi = new int[] {10, 20, 20, 10, 10, 20, 5, 20};
        int[] gecici = new int[dizi.length];
        
        for (int i = 0; i<dizi.length; i++){
            int sayac = 1;
            for (int j=i+1; j<dizi.length; j++){
                if (dizi[i]==dizi[j]){
                    sayac++;
                    gecici[j]=gorulen;
                }
            }
            if (gecici[i]!=gorulen)
                gecici[i]=sayac;
        }
        for (int i=0; i< gecici.length;i++){
            if (gecici[i]!=gorulen){
                System.out.println(dizi[i] + " sayısı " + gecici[i] + " kere tekrar edildi.");
            }
        }
    }
}
