package sorular_2_DataCasting;

import java.util.Scanner;

public class S02_sonrakiUcHarfNedir {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf giriniz: ");
        char harf = scan.next().charAt(0);

        System.out.println(""+(char) (harf + 1) + (char)(harf + 2) +(char) (harf + 3));//def

        System.out.println("" + (harf + 1) + (harf + 2) + (harf + 3));//100101102 c=100
        System.out.println((char) (harf + 1) + (harf + 2) + (harf + 3));//303

        System.out.println(""+(char) (harf + 1) + (harf + 2) + (harf + 3));//d101102
        System.out.println(""+(char) ((harf + 1) + (harf + 2) + (harf + 3)));//i



    }

}
