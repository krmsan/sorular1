package sorular_4_IfStatements;

import java.time.LocalDate;

public class S11_ArtikYilMi {

                     /*Soru ) Interview Question

                Kullanicidan artik yil olup olmadigini kontrol
                etmek icin yil girmesini isteyin.

                Kural 1: 4 ile bolunemeyen yillar artik yil
                degildir

                Kural 2: 4 ile bolunup 100 ile bolunemeyen
                yillar artik yildir

                Kural 3: 4’un kati olmasina ragmen 100 ile
                bolunebilen yillardan sadece
                400’un kati olan yillar artik yildir

                     */

    public static void main(String[] args) {

        LocalDate tar = LocalDate.now();
        System.out.println(tar.withYear(1700).isLeapYear());//false
        System.out.println(tar.withYear(2000).isLeapYear());//true


        System.out.println("metot sonucu : "+artikYilMi(1900));//false
        System.out.println("metot sonucu : "+artikYilMi(1904));//true
        System.out.println("metot sonucu : "+artikYilMi(2000));//true
        System.out.println("metot sonucu : "+artikYilMi(1903));//false artık yıl degil
        System.out.println("metot sonucu : "+artikYilMi(1996));//true

    }


    public static boolean artikYilMi(int artikyil) {


        if (artikyil % 4 == 0) {

            if (artikyil % 100 == 0) {

                if (artikyil % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;

        } else  {
            System.out.println("artık yıl degil");
            return false;
        }
    }
}
