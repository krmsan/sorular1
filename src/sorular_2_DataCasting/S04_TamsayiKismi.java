package sorular_2_DataCasting;

public class S04_TamsayiKismi {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        double a = 12.5;
        double b = 3.5;
        int tamsayiKismi = (int) a / (int) b;
        System.out.println(12.5 / 3.5);//3.57
        System.out.println((int) 12.5 / 3.5);//3.42
        System.out.println(12.5 / (int) 3.5);//4.166
        System.out.println(tamsayiKismi);//4

        ///////////////////////////////////////////***************/////////////////////////////////
        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        double c= 12.5;
        int e = 3;
        int d = (int) a / e;
        System.out.println(12.5 / 3);//4.166

        //    tamsayiKismi=(int) a/ (?)b; boyle kabul etmez   (?) soruyor===== cunku b de double kayıtlı
        System.out.println((int) 12.5 / 3);//4

    }
}
