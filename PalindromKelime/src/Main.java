import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Kelime Giriniz : ");
        String word = input.nextLine();
        palindrom( word );
    }

    static String palindrom(String word){
        StringBuilder lastNum = new StringBuilder();
        lastNum.append(word);
        lastNum.reverse();
        if (lastNum.toString().equals(word))
            System.out.print( "Bu Bir Palindrom Kelimedir..." );
        else
            System.out.print("Bu Bir Palindrom Kelime Değildir...");
        return "";
    }
}
