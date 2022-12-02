package sorular_5_ternary;

import sorular_0ScannerCagirma.Scan;

public class S04_BuyukSayi extends Scan {
    //iki sayi alin ve buyuk olmayni yazdirin
    public static void main(String[] args) {
        S04_BuyukSayi obj = new S04_BuyukSayi();
        int sayi1 = obj.sayiAl();
        int sayi2 = obj.sayiAl();
        System.out.println(sayi1 > sayi2 ? sayi1 : sayi2);

    }
}
