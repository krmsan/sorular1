package sorular_1_valueof_parseInt;

public class S022_RT_Math {
    public static void main(String[] args) {

//===========uzun yol==============
        int sayi = 1234567;
        int top = 0;
        String sayistr = "" + sayi;
        int[] sayilar = new int[sayistr.length()];
        for (int i = 0; i < sayistr.length(); i++) {
            for (int j = 0; j < sayistr.length(); j++) {
                sayilar[j] += sayi % 10;
                sayi = sayi / 10;
            }
            top += sayilar[i];
        }
        System.out.println(top);

        //========================

    }
}
