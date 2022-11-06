package sorular_1_valueof_parseInt;

public class S01_valueof {
    public static void main(String[] args) {

        int x = 6;
        String str = String.valueOf(x);

        System.out.println(x);
        System.out.println(str);

        String st="123456";
        int sayi=Integer.valueOf(st);
        System.out.println("string olarak: "+st);//string olarak: 123456
        System.out.println("sayi olarak: "+sayi);//sayi olarak: 123456


        String s="123457";
        System.out.println(Integer.parseInt(s));//123457   int
        System.out.println(Integer.valueOf(s));//123457   Integer



    }
}
