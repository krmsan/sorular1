package sorular_0ScannerCagirma;

import java.util.Scanner;

 public class Scan {


    public int rakamAl(){
        Scanner scan=new Scanner(System.in);
        System.out.println("bir rakam giriniz: ");
        int rakam= scan.nextInt();
        return rakam;
    }

    public int sayiAl(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        return sayi;
    }

    public char harfAl(){
        Scanner scan=new Scanner(System.in);
        char harf=scan.next().charAt(0);
        return harf;
    }

    public String kelimeAl(){
        Scanner scan=new Scanner(System.in);
        String kelime=scan.nextLine();
        return kelime;
    }
}
