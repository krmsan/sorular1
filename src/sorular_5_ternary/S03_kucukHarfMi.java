package sorular_5_ternary;

import java.util.Scanner;

public class S03_kucukHarfMi {
    //Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
    //harf olarak yazdirin, yoksa girilen harfi yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char harf = scan.next().charAt(0);
        System.out.println(harf >= 'a' && harf <= 'z' ? (char) (harf - 32) : harf);

        if (harf >= 'a' && harf <= 'z') {
            System.out.println("true");
        }
    }
}
