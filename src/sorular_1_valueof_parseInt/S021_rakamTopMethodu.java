package sorular_1_valueof_parseInt;

public class S021_rakamTopMethodu {
    public static void main(String[] args) {
        int sayi = 1234567;
        int toplam = rakamlariTopla(sayi);

        System.out.println(toplam);
    }

    public static int rakamlariTopla(int sayi) {
        sayi = 123;

        String str = "" + sayi;

        String[] arr = new String[str.length()];
        arr = str.split("");

        int toparr = 0;
        int top1 = 0;
        int top = 0;
        for (int i = 0; i < str.length(); i++) {

            toparr += Integer.valueOf(arr[i]);

            top += Integer.valueOf("" + str.charAt(i));

            top1 += Integer.valueOf(str.substring(i, i + 1));


        }
        return top;
    }
}