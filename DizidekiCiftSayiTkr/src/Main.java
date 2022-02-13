import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] liste = {-12,2,4,5,2,7,-12,9,2,4,8,5,7,8};
        int sayac = 0;
        int[] ciftSayilar = new int[liste.length];

        for (int i=0; i<liste.length;i++){
            for (int j=0; j<liste.length;j++){
                if ((i!=j) && (liste[i]%2==0) && (liste[i]==liste[j])){
                    ciftSayilar[sayac]=liste[i];
                    sayac++;
                    break;
                }
            }
        }
        int[] filtrele = Arrays.stream(ciftSayilar).filter(num -> num != 0).toArray();  // Filtreleme ile 0 ları atıyoruz
        Integer[] donusum = Arrays.stream( filtrele ).boxed().toArray( Integer[]::new ); //int[] arrays leri Integer[] listlere çeviriyoruz
        List<Integer> ciftsiz = Arrays.asList(donusum).stream().distinct().collect( Collectors.toList());  // Aynı sayıları kaldırıyoruz

        System.out.print(ciftsiz);
    }
}

