package sorular_8_ForLoops;

import sorular_0ScannerCagirma.Scan;

public class S04_sayilarToplami2 {
    //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
    //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
    //baslangic degerinden kucuk olsa da program calissin
    public static void main(String[] args) {

        Scan obj=new Scan();
        int baslangic= obj.sayiAl();//0
        int bitis= obj.sayiAl();//5
        int top=0;

        if (baslangic<=bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                top += i;


            }
        }

        if (baslangic>=bitis) {
            for (int i = bitis; i <= baslangic; i++) {
                top += i;


            }
        }
        System.out.println(top);//15
    }
}
