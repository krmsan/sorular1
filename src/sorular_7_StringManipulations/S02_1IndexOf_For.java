package sorular_7_StringManipulations;

import java.util.ArrayList;
import java.util.List;

public class S02_1IndexOf_For {

    static String str = "azcokazcokazcokdur";
    static String aranan = "az";


    public static void main(String[] args) {

        S02_1IndexOf_For obj = new S02_1IndexOf_For();
        obj.metinkackerevar(str, aranan);

        //boyle bi durumda str lar kendi scopunda kullanılanı tercih eder
        // listem = [10]
        //kac kere var: 1 olarak yazar
    }

    public void metinkackerevar(String str, String aranan) {
        //str = "bababababababaannenenenene";
        // aranan = "babaanne";
        List<Integer> listem = new ArrayList<>();
        for (int i = 0; i <= str.lastIndexOf(aranan); i++) {
            i = str.indexOf(aranan, i);
            listem.add(i);
        }
        System.out.println("listem = " + listem);
        System.out.println("kac kere var: " + listem.size());
    }


}
