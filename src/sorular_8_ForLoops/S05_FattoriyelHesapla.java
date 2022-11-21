package sorular_8_ForLoops;

import sorular_0ScannerCagirma.Scan;

public class S05_FattoriyelHesapla {
    //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
    //hesaplayin.
    public static void main(String[] args) {
        System.out.println("sonuc = " + fakatoriyel());
    }
    public static void x(){
        int sonuc =10;
    }
    public static int fakatoriyel(){
        Scan obj=new Scan();
        int sayiAl = obj.sayiAl();
        int sonuc=1;

        if (sayiAl<20){
            for (int i = 1; i <=sayiAl ; i++) {
                sonuc*=i;
            }
        }else {
            System.out.println("sayı 20 den kucuk olsun");
           sonuc= fakatoriyel();
        }

        //System.out.println(sayiAl+"'in faktoriyeli : "+faktoriyel);


        return sonuc;
    }
}
