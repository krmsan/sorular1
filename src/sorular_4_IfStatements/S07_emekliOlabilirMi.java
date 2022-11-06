package sorular_4_IfStatements;

import java.util.Scanner;

public class S07_emekliOlabilirMi {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        emekliOlabilirMi();
    }

    public static void emekliOlabilirMi() {

        Scanner scan = new Scanner(System.in);
        System.out.println("yasınızı giriniz");
        int yas = scan.nextInt();
        System.out.println("cinsiyetinizi girniz E/K ");
        scan.nextLine();//bunu yazınca duzeliyor
        String cinsiyet = scan.nextLine();// next olunca yazdırıyor ama nextline da yazmıyor ustte aynısını yaz

        if (!cinsiyet.equalsIgnoreCase("e") && !cinsiyet.equalsIgnoreCase("k")) {
            System.out.println("yanlıs giris e/k olarak gir");
        }


        if (cinsiyet.equalsIgnoreCase("e")) {
            if (yas >= 65) {
                System.out.println("emekli olabilrisin");
            } else if (yas < 65) {
                System.out.println("emeklilik için " + (65 - yas) + " yıl daha calısmalısın");
            }
        }

        if (cinsiyet.equalsIgnoreCase("k")) {
            if (yas >= 60) {
                System.out.println("emekli olabilrisin");
            } else if (yas < 60) {
                System.out.println("emeklilik için " + (60 - yas) + " yıl daha calısmalısın");
            } else System.out.println("yanlıs giris e/k olarak gir");
        }
    }
}