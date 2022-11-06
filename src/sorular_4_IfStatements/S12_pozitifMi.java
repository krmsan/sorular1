package sorular_4_IfStatements;

public class S12_pozitifMi {
    public static void main(String[] args) {


        //Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        //yazdirin


        int sayi=-2;

        if (sayi%2!=0){
            if (sayi<0){
                System.out.println(sayi+" negatif tek sayıdır");
            }else System.out.println(sayi+" pozitif tek sayıdır");


        }else {

            if (sayi%10==0){
                System.out.println(sayi+"10 ile tam bolunen sayıdır");
            }else System.out.println("cift sayıdır");


        }


    }
}
