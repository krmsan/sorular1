package sorular_4_IfStatements;

import java.util.Scanner;

public class S13_haftaIciMi {

    //Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
    //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
    //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
    //zamani” yazdirin.

    public static void main(String[] args) {
        String gun = "Pazarr";

        int sayac = 0;
        String[] hafta = {"pazartesi", "salı", "carsamba", "persembe", "cuma", "cumartesi", "pazar"};

        for (int i = 0; i < hafta.length; i++) {

            sayac++;

            if (i < hafta.length - 2) {
                if (hafta[i].equalsIgnoreCase(gun)) System.out.println("hafta içi");

            } else if (i < hafta.length) {
                if (hafta[i].equalsIgnoreCase(gun)) System.out.println("hafta sonu");
            }

            if (sayac == 7 && !gun.equalsIgnoreCase("pazar")) System.out.println("hatalı giriş yaptınız");
        }

    }


    public static void gunismi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("harf gir");
        char harf = scan.next().charAt(0);
        switch (harf) {
            case 'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Development");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("gecersiz");
        }


    }

}


