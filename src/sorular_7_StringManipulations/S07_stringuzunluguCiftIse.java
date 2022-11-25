package sorular_7_StringManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S07_stringuzunluguCiftIse {
    //Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
    //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
    //yazdirin.

    static String str="012345678012345678";

    public static void main(String[] args) {
        String[] arr = str.split("");
        int a = arr.length;
        List<String> arrlist = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            arrlist.add(arr[i]);
        }
        if (a % 2 == 0) {
            arrlist.add(a / 2, ":)");//[0, 1, 2, 3, 4, 5, 6, 7, 8, :), 0, 1, 2, 3, 4, 5, 6, 7, 8]
        } else arrlist.set(a / 2, ":)");//[0, 1, 2, 3, 4, 5, 6, 7, 8, :), 1, 2, 3, 4, 5, 6, 7, 8, 0]
        System.out.println(arrlist);
/////////////////////////////////////////////////////////////////////////////////////////////////////
        char[] harf = str.toCharArray();
        int x = harf.length;
        System.out.println(x);
        if (x % 2 == 0) {
            harf[(x / 2)] = 'A';
        }
        harf[0] = 'A';
        harf[1] = 'B';
        char[] c = {'S', 'D', 'f'};
        harf = c;
        System.out.println(Arrays.toString(harf));

//////////////////////char arrayi String arraye atama/////////////////
        String[] yeni =new String[c.length];
        for (int i = 0; i < c.length; i++) {
            yeni[i]="";
            yeni[i] += c[i];
        }
        System.out.println(Arrays.toString(yeni));
    }
}
