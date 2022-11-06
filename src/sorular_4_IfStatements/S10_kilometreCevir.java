package sorular_4_IfStatements;

public class S10_kilometreCevir {

    //Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
    //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
    //“istediginiz birim sisteme kayitli degil” yazdirin.

    public static void main(String[] args) {
        double kilometre=5;
        String cevir="metre";

        System.out.println(kilometreCevir(kilometre,cevir));
    }

    public static double kilometreCevir(double kilometre,String cevir){
        kilometre=0;
        cevir="";
        if (cevir.equalsIgnoreCase("metre")){
            double metre=kilometre*1000;
            return metre;

        } else if (cevir.equalsIgnoreCase("santimetre")) {
            double santiMetre=kilometre*1000*100;
            return santiMetre;

        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");

            return 0;
        }

    }

}
