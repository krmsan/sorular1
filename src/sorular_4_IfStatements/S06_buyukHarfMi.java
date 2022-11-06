package sorular_4_IfStatements;

public class S06_buyukHarfMi {
    public static void main(String[] args) {
        char a = 'a';
        if (a >= 'A' && a <= 'Z') {
            System.out.println("BUYUK HARF");
        } else System.out.println("DEGIL");

        for (char i = 'A'; i <= 'Z'; i++) {
            if (a == i) {
                System.out.println("buyuk harftir");
                break;
            } else System.out.println("Degildir");
            break;
        }
        //////////////////////////******Kucuk harfse buyuge cevir******/////////////////////a-32=A

        if (a >= 'a' && a <= 'z') {
            String b = String.valueOf(a);
            b = b.toUpperCase();
            System.out.println(b);//A
        }
        ////////////////VEYA BOYLE STRİNGLESTİRE BİLİRİZ///////////////////////////

        if (a >= 'a' && a <= 'z'){
            String str="";
            str+=a;//a char dı ama bu sekilde stringlestirdik
            str=str.toUpperCase();
            System.out.println("str: "+str);//A
        }

        if (a >= 'a' && a <= 'z') {
            System.out.println((char) (a-32));//A
        }
        /*
        char x='a';//a=97   A=65
        System.out.println(x+1);
        System.out.println(97-65);//32

         */





    }
}
