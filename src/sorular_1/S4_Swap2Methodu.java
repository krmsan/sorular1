package sorular_1;

import java.util.Scanner;

public class S4_Swap2Methodu {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
         int sayi1 = scan.nextInt();
         int sayi2 = scan.nextInt();

        swap2(1,9);//yenisayi1: 9    yenisayi2: 1 yazar

        System.out.println(sayi1);//1 bunlar degismez method içinde degiştiler ama
        System.out.println(sayi2);//9
    }

    public static void swap2(int sayi1, int sayi2) {


        int boskutu = 0;
        boskutu = sayi1;
        sayi1 = sayi2;
        sayi2 = boskutu;

        System.out.println("yenisayi1: "+sayi1 );
        System.out.println("yenisayi2: " + sayi2);

    }
}
