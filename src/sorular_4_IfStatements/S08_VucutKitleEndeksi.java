package sorular_4_IfStatements;

import java.util.Scanner;

public class S08_VucutKitleEndeksi {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("kilonuzu giriniz");
        double kilo=scan.nextDouble();
        System.out.println("boyunuzu giriniz");
        double boy=scan.nextDouble();

       // vkeHesapla(kilo,boy);

 */

        //vkeHesapla(58,172);//zayıf

       double vke= vkesonucu(173,59);

      vkeHesapla();

    }
    public static void vkeHesapla(){


        double kilo=0;
        double boy=0;
        double vke=(kilo*10000 / (boy *boy));



        System.out.println("vücut kitle endeksiniz: "+vke);
        if (vke>30){
            System.out.println("obezsiniz");
        } else if (vke>25) {
            System.out.println("kilolusunuz");
        }else if (vke>20){
            System.out.println("normalsiniz");
        }else System.out.println("zayıfsınız");



    }

    public static double vkesonucu(double boy,double kilo){
        double vke=(kilo*10000 / (boy *boy));

        return vke;
    }
}
