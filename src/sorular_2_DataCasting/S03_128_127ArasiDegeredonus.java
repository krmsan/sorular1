package sorular_2_DataCasting;

public class S03_128_127ArasiDegeredonus {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.
        int a = 1234567;
        byte b = (byte) a;
        System.out.println(b);// -121


        a = 12;
        b = (byte) a;
        System.out.println(b);// 12

    }
}
