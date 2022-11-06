package sorular_1;

public class S3_swapMethodu {
    public static void main(String[] args) {
        //swap2(5,6);//boyle yazarsan 5 ve 6 nın hiç önemi olmaz method keni içinde istiyor
        swap(5,9);
    }

    public static void swap(int sayi1, int sayi2) {
       // Scanner scan = new Scanner(System.in);
        //System.out.println("iki sayi giriniz");
         //sayi1 = scan.nextInt();
        // sayi2 = scan.nextInt();

        int boskutu = 0;
        boskutu = sayi1;
        System.out.println("yenisayi1: " + (sayi1 = sayi2));
        System.out.println("yenisayi2: " + (sayi2 = boskutu));

    }
}
