package sorular_2_DataCasting;

public class S01_int_doubleYap {
    //Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
    //yazin

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c = 10;
        double ort = (double) (a + b + c) / 3;
        double ort1 = (a + b + c) / 3.0;
        System.out.println(ort);
        System.out.println(ort1);

    }
}
