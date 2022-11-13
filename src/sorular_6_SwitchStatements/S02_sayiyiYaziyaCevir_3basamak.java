package sorular_6_SwitchStatements;

import sorular_0ScannerCagirma.Scan;

public class S02_sayiyiYaziyaCevir_3basamak extends Scan {
    //Soru 2- Kullanicidan 0'dan 1000'e kadar bir sayi alip, girilen sayiyi yazi ile yazdirin
    static int i = new S02_sayiyiYaziyaCevir_3basamak().rakamAl();//kullanıcıdan aldıgımız sayı (i)
    String[] yuzler={"","yuz","ikiyuz","ucyuz","dortyuz","besyuz","altıyuz","yediyuz","sekizyuz","dokuzyuz"};
    String[] onlar = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmıs", "yetmis", "seksen", "doksan"};
    String[] birler = {"", "bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"};

    public static void main(String[] args) {

        S02_sayiyiYaziyaCevir_3basamak s01 = new S02_sayiyiYaziyaCevir_3basamak();
        // Scan s02=new Scan();
        //Scan s02 = new S02_sayiyiYaziyaCevir_3basamak();//3 u de olabilirdi   //i = s02.rakamAl();

        //System.out.println("stringrakam = " + s01.stringrakam[i%10]); rakamlar için

        s01.yaziyacevir();
    }
    public void yaziyacevir() {
        String sifir = "sifir";
        String yuz="yuz";
        //S02_sayiyiYaziyaCevir_3basamak obj = new S02_sayiyiYaziyaCevir_3basamak();gerek yok kendi clası
        //System.out.println(i == 0 ? sifir : str[i / 10].concat(stringrakam[i % 10]));iki basamaklı icin
        System.out.println(i == 0 ? sifir : yuzler[i/100]+onlar[(i%100)/10].concat(birler[i % 10]));

    }
}
