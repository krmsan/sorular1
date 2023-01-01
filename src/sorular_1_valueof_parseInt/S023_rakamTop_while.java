package sorular_1_valueof_parseInt;

public class S023_rakamTop_while {
    public static void main(String[] args) {
        int sayi = 1234567;
        int top = 0;
        int bolen = 1000000;
        while (sayi >= 1) {

            top += sayi / bolen;
            sayi = sayi % bolen;//7%1=0
            bolen = bolen / 10;
            System.out.println(sayi);
        }

        System.out.println(top);

        //======================
        while (sayi >= 1) {
            sayi = sayi % 10;
            top += sayi / 10;
        }
        System.out.println(top);
    }
}
