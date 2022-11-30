package sorular_6_SwitchStatements;

import java.util.Scanner;

public class S06_hangiMevsim {
    //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.
    public static void main(String[] args) {
        String[] aylar={"","Ocak","Subat","Mart","Nisan","Mayis","Haziran","Temmuz","Agustos","Eylul","Ekim","Kasim","Aralik"};

        System.out.println("==========Ay numarasi giriniz.===========\n Aynum =  ");
        int i = new Scanner(System.in).nextInt();
        switch (i) {
            case 1:
            case 2:
            case 12:
                System.out.println(aylar[i]+" KIS");
            break;
            case 3: case 4: case 5:
                System.out.println(aylar[i]+" ILKBAHAR");
                break;
            case 6: case 7: case 8:
                System.out.println(aylar[i]+" YAZ");
                break;
            case 9: case 10: case 11:
                System.out.println(aylar[i]+" SONBAHAR");
                break;
            default:
                System.out.println("yanlis giris yaptiniz");
        }
    }
}
