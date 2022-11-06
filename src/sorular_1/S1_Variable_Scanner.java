package sorular_1;

import java.util.Scanner;

public class S1_Variable_Scanner {
    public static void main(String[] args) {
        /*
        soru 1 :Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
        yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi gir");

        int sayi1 = scan.nextInt();
        double sayi2 = scan.nextDouble();

        System.out.println("sayi1 : " + sayi1 + " \nsayi2 : " + sayi2);

        ///////////////////////////////SORU 2 /////////////////////////////////////////////

        /*
        soru 2:Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        yazdirin.
         */

        System.out.println("top: " + (sayi1 + sayi2) + " dir" +
                "\nsayi1 ve sayi2 carp : " + sayi1 * sayi2 + " dir");

        //////////////////////////SORU 3 ////////////////////////////////
        /*
        soru3 :Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir
         */

        scan.nextLine(); // bunu yazınca duzeldi
        System.out.println("isminizi yaz");
        String isim = scan.nextLine();

        System.out.println("Soyisminizi giriniz");
        String soy = scan.nextLine();

        System.out.println("yasınız");
        double yas = scan.nextDouble();

        System.out.println("Isminiz : " + isim +
                "\nSoyisminiz : " + soy +
                "\nYasiniz : " + yas +
                "\nKaydiniz basariyla tamamlanmistir");

        ///////////////////////////////SORU 4 //////////////////////////////////////

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //yazdirin

        double diktortgenAlani;
        diktortgenAlani = sayi1 * sayi2;
        System.out.println("alan: " + diktortgenAlani);//

        ////////////////////////////SORU 5 //////////////////////////////////////////

        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        isim = isim.substring(0, 1).toUpperCase();

        soy=soy.replaceFirst(soy.substring(0,1),soy.substring(0,1).toUpperCase());
        //replace tum "s" leri buyuk yapar

        System.out.println(isim + " " + soy + ", " + yas);//

        /////////////////////////////////SORU 6 /////////////////////////////////////

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        double yaricap=5;
        double cemberCevresi=2*Math.PI*yaricap;
        double cemberAlani=Math.PI*yaricap*yaricap;

        System.out.println("cemberin cevresi: " +cemberCevresi +"\ncemberin alani: "+cemberAlani);

    }
}
