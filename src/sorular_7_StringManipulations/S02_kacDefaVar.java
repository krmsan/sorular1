package sorular_7_StringManipulations;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S02_kacDefaVar {
    //Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
    //icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
    //- String aranan metni icermiyor
    //- Aranan metin String’de sadece 1 kere kullanilmis
    //- Aranan metin String’de sadece 1’den fazla kullanilmis
    // indexof ile yap lastindexof

    static String str = "Merhaba dunya33";
    static String aranan = "a";

    public static void main(String[] args) {
        if (str.contains(aranan)) System.out.println("içeriyor");

        if (str.indexOf(aranan) == -1) {
            System.out.println("içermiyor");
        } else if (str.indexOf(aranan) == str.lastIndexOf(aranan)) {
            System.out.println("bir kere vardır");
        } else System.out.println("birden fazla vardir");
//////////////////////////////////////////////////////////////////////////////

/*
        int x = str.indexOf(aranan);//4
        int y = str.indexOf(aranan, x + 1);//6
        int z = str.indexOf(aranan, y + 1);//12
        int f = str.indexOf(aranan, z + 1);//-1


 */

        List<Integer> listem = new ArrayList<>();
/*
        int sayac = 0;
        System.out.println("str.length() = " + str.length());//15
        for (int i = 0; i <= str.lastIndexOf(aranan); i++) {

            if (str.indexOf(aranan)==i)listem.add(i);
            if (i>=0){
                i = str.indexOf(aranan, i + 1);
                listem.add(i);
            }else break;

            sayac++;
        }

 */
/*
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(aranan)==i){
                listem.add(i);
            }else {
                i=str.indexOf(aranan,i);
                if (i==-1)break;
                listem.add(i);
            }

        }

 */
/*
        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(aranan, i) >= i) {
                listem.add(str.indexOf(aranan, i));
                i = str.indexOf(aranan, i);
            } else break;

        }

 */
/*
        for (int i = 0; i < str.length(); i++) {
            int a=str.indexOf(aranan,i);
            if (a != -1) {             //if (a >= i)
                listem.add(a);
                i = a;
            } else break;

        }

 */
/*
        for (int i = 0; i < str.length(); i++) {
            int a = str.indexOf(aranan, i);
            if (a == -1) break;
            listem.add(a);
            i = a;
        }

 */

        for (int i = 0; i < str.lastIndexOf(aranan); i++) {
            listem.add(str.indexOf(aranan, i));
            i = str.indexOf(aranan, i);
        }
        System.out.println("listem = " + listem);
        //  System.out.println("sayac = " + sayac);
    }


    private void replaceler() {

        System.out.println(str.replace("a", "@"));//Merh@b@ duny@33
        System.out.println(str.replaceFirst("\\W", "12"));//Merhaba12dunya33 buyuk W
        System.out.println(str.replaceAll("\\W", "12"));//Merhaba12dunya33   BUYUK W
        System.out.println(str.replaceFirst("\\w", "12"));//12erhaba dunya33      k w
        System.out.println(str.replaceAll("\\w", "12"));//12121212121212 12121212121212  k w

        System.out.println(str);
    }


    //Soru 1 : Kullanicidan bir cumle alin
    //- cumlede ev geciyorsa, "home home sweet home" yazdirin
    //- cumlede is geciyorsa, "calismak guzeldir"
    //- ikisini de iceriyorsa "Hem ev lazim hem is"
    //- hicbirini icermiyorsa "cok calisman lazim" yazdirin
}
