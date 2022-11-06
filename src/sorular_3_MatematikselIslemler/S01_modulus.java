package sorular_3_MatematikselIslemler;

public class S01_modulus {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

        int a = 1234;
        String b = "" + a;
        int top = 0;
        for (int i = 0; i < 4; i++) {
            top += Integer.valueOf("" + b.charAt(i)); //split veya substring de olur

        }
        System.out.println(top);

        //////////////////////////////////////////////////////////////////
        top = 0;

        for (int i = 0; i < b.length(); i++) {
            top += a % 10;
            a = a / 10;

        }
        System.out.println(top);
    }

}
