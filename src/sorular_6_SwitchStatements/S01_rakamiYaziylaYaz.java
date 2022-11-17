package sorular_6_SwitchStatements;

import java.util.Scanner;

public class S01_rakamiYaziylaYaz {

    //Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

    public static void main(String[] args) {
        S01_rakamiYaziylaYaz obj = new S01_rakamiYaziylaYaz();

        obj.rakamyaz();

        switch (obj.rakamiDondur()) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            case 0:
                System.out.println("sifir");
                break;
            default:
                System.out.println("0 ile 9 arası bir rakam giriniz") ;
                break;

        }
    }

    public static int rakamiDondur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam giriniz: ");
        int rakam = scan.nextInt();
        return rakam;
    }

    public  void rakamyaz() {
        String[] stringrakam = {"sifir", "bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"};
        int i = rakamiDondur();
        System.out.println("stringrakam[i] = " + stringrakam[i]);
        System.out.println(i);
    }
}
