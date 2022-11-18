package sorular_8_ForLoops;

import sorular_0ScannerCagirma.Scan;

public class S03_sayilarToplami {
    //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
    //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
    //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
    public static void main(String[] args) {
        Scan obj=new Scan();
        int baslangic= obj.sayiAl();//12
        int bitis= obj.sayiAl();//23
        int top=0;
       if (!(bitis<baslangic)) {
           for (int i = baslangic; i <= bitis; i++) {
               top += i;
           }
           System.out.println(top);//210
       }else System.out.println("bitis degeri kucuk olamaz baslangic degerinden");
    }
}
