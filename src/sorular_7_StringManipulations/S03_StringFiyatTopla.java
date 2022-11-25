package sorular_7_StringManipulations;

public class S03_StringFiyatTopla {
    //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
    //input1 : “15.30 €” , input2 : “11.40 €”
    //output : 26.70 €
public static void fiyaToplaYazdir(String... fiyat){
    int fiyat1=Integer.parseInt(fiyat[0].replaceAll("\\D",""));
    int fiyat2=Integer.valueOf(fiyat[1].replaceAll("\\W",""));

    String str=fiyat[0].substring(0,fiyat[0].indexOf("."));
    double a=(fiyat1+fiyat2);
    System.out.println("tolam fiyat: "+a);



}

    public static void main(String[] args) {

        fiyaToplaYazdir("15.30 €","11.40 €");
    }
}
