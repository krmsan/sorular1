package sorular_1;

public class S5_swap3returnMethod {
    public static void main(String[] args) {

        double sayi1 = 124;
        double sayi2 = 5;

        String yeni = swap(sayi1, sayi2);
        System.out.println("swap sonucu: "+yeni);//sayi1: 5.0 ve sayi2: 1.0

        sayi1 = Double.valueOf(yeni.substring(0, yeni.indexOf(" ")));
        sayi2 = Double.valueOf(yeni.substring(yeni.indexOf(" ")));

        System.out.println("sayi1: " + sayi1);//1
        System.out.println("sayi2: " + sayi2);//5

        sayi1 = Double.valueOf(yeni.split(" ")[0]);
        sayi2 = Double.valueOf(yeni.split(" ")[1]);

        System.out.println("sayi1: " + sayi1);//1
        System.out.println("sayi2: " + sayi2);//5

    }

    public static String swap(double sayi1, double sayi2) {

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;//sayi1 sayi2 oldu
        sayi1 = sayi1 - sayi2;//sayi1 10 du yeni sayi2 4 oldu cıkardık mı yeni sayi1 olur

        //System.out.println("yeni sayi1: " + sayi1);

        //System.out.println("yeni sayi2: "+ sayi2);

        return sayi1 + " " + sayi2;
    }
}
