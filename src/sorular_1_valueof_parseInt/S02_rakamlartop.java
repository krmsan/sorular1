package sorular_1_valueof_parseInt;

public class S02_rakamlartop {
    public static void main(String[] args) {

        int sayi = 123;

        String str = "" + sayi;

        String[] arr = new String[str.length()];
        arr = str.split("");

        int toparr = 0;
        int top1 = 0;
        int top = 0;
        for (int i = 0; i < str.length(); i++) {

            toparr += Integer.valueOf(arr[i]);

            //top += Integer.valueOf("" + str.charAt(i)); //Integer donuyor
            top += Integer.parseInt("" + str.charAt(i)); //valueof ile aynı gibi ama int donuyor

            top1 += Integer.valueOf(str.substring(i, i + 1));


        }
        System.out.println(top);
        System.out.println(top1);
        System.out.println(toparr);
    }
}
