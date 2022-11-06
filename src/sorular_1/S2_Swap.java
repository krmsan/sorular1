package sorular_1;

import java.util.Scanner;

public class S2_Swap {
    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2 =scan.nextInt();

        int boskutu=0;
        System.out.println(boskutu = sayi1);
        System.out.println("yenisayi1: "+(sayi1 = sayi2));
        System.out.println("yenisayi2: "+(sayi2 = boskutu));


        /////////////////////////////////// SORU 8 /////////////////////////
        //Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).

        sayi1=4;
        sayi2=6;

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;//sayi1 sayi2 oldu
        sayi1=sayi1-sayi2;//sayi1 10 du yeni sayi2 4 oldu cıkardık mı yeni sayi1 olur

        System.out.println("yeni sayi1: " + sayi1);
        System.out.println("yeni sayi2: "+ sayi2);


        swap(sayi1,sayi2);
    }

    public static void swap(double sayi1,double sayi2){

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;//sayi1 sayi2 oldu
        sayi1=sayi1-sayi2;//sayi1 10 du yeni sayi2 4 oldu cıkardık mı yeni sayi1 olur

        System.out.println("yeni sayi1: " + sayi1);
        System.out.println("yeni sayi2: "+ sayi2);
    }

}
