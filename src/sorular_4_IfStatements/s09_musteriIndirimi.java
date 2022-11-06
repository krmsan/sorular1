package sorular_4_IfStatements;

public class s09_musteriIndirimi {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin


        int urunAdet=20;
        double fiyat =100;
        boolean kartVarMi=true;
        double tpfiyat=0;

        if (kartVarMi==true){
            if (urunAdet>10){
                fiyat=fiyat*0.8;
                tpfiyat=fiyat*urunAdet;
                System.out.println("tpolam fiyat: "+tpfiyat);
            }else {
                fiyat=fiyat*0.85;
                tpfiyat=fiyat*urunAdet;
                System.out.println("tpolam fiyat: "+tpfiyat);
            }
        }else {
            if (urunAdet>10){
                fiyat=fiyat*0.85;
                tpfiyat=fiyat*urunAdet;
                System.out.println("tpolam fiyat: "+tpfiyat);
            }else {
                fiyat=fiyat*0.90;
                tpfiyat=fiyat*urunAdet;
                System.out.println("tpolam fiyat: "+tpfiyat);
            }
        }

        System.out.println(indirimlifiyat(1000));
        System.out.println(topfiyathesabi(indirimlifiyat(1000), 30));

    }
    public static double indirimlifiyat(double fiyat){

        int urunAdet=20;

        boolean kartVarMi=true;
        double tpfiyat=0;

        if (kartVarMi==true){
            if (urunAdet>10){
                fiyat=fiyat*0.8;
                tpfiyat=fiyat*urunAdet;
                System.out.println("tpolam fiyat: "+tpfiyat);
            }else {
                fiyat=fiyat*0.85;
                tpfiyat=fiyat*urunAdet;
                System.out.println("tpolam fiyat: "+tpfiyat);
            }
        }else {
            if (urunAdet>10){
                fiyat=fiyat*0.85;
                tpfiyat=fiyat*urunAdet;
                System.out.println("tpolam fiyat: "+tpfiyat);
            }else {
                fiyat=fiyat*0.90;
                tpfiyat=fiyat*urunAdet;
                System.out.println("tpolam fiyat: "+tpfiyat);
            }
        }

        return fiyat;
    }
    public static double topfiyathesabi(double indirimlifiyat, int urunAdet){

        double tpfiyat=indirimlifiyat* urunAdet;
        System.out.println("tpolam fiyat: "+tpfiyat);
        return tpfiyat;
    }
}
