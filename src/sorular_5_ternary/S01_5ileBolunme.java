package sorular_5_ternary;

public class S01_5ileBolunme {
    //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
    //“Sayi 5’in tam kati” yazdirin.

    public static void main(String[] args) {
        int sayi = 15;
        System.out.println(sayi % 5 == 0 ? sayi+" 5'in tam katıdır" : sayi+" 5 ile tam bolunmez");
    }
}
