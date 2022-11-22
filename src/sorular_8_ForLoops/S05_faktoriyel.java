 package  sorular_8_ForLoops;

import sorular_0ScannerCagirma.Scan;

public class S05_faktoriyel {
    public static void main(String[] args) {
        System.out.println("sonuc = " + faktoriyel());
    }

    public static int faktoriyel(){
        Scan obj=new Scan();
        int sayiAl = obj.sayiAl();
        System.out.println("---------------------");
        int sonuc=1;

        /*
        if(obj.kelimeAl().equalsIgnoreCase("q")){
            System.exit(0);
        }
         */


        if (sayiAl<20){
            for (int i = 1; i <=sayiAl ; i++) {
                sonuc*=i;
            }
        }else {
            System.out.println("sayı 20 den kucuk olsun");
            sonuc= faktoriyel();
        }

        System.out.println(sayiAl+"'in faktoriyeli : "+sonuc);

        System.out.println("bitirmek icin q ya basınız\ndevam etmek icin enter'a basiniz");
        if(obj.kelimeAl().equalsIgnoreCase("q")){
            System.exit(0);
        }
        return faktoriyel();
    }

}
