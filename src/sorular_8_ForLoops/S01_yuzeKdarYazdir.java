package sorular_8_ForLoops;

public class S01_yuzeKdarYazdir {
    public static void main(String[] args) {
        //Soru 1- 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
        //yazdirin.

        String s="";
        for (int i = 1; i <=100 ; i++) {

            s+=" "+i;
        }
        System.out.println(s);
    }
}
