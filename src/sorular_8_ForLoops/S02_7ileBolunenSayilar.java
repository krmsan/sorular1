package sorular_8_ForLoops;

import sorular_0ScannerCagirma.Scan;

public class S02_7ileBolunenSayilar {
    //Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
    //dahil) 7 ila bolunebilen sayilari yazdirin.
    public static void main(String[] args) {
        Scan obj=new Scan();
        int a=obj.sayiAl();//123
        String s="";
        for (int i = 1; i <=a ; i++) {
            if (i%7==0){
                s+=" "+i;
            }
        }
        System.out.println(s);// 7 14 21 28 35 42 49 56 63 70 77 84 91 98 105 112 119
    }
}
