package sorular_5_ternary;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S02_eskenarMi {
    //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
    //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int [] knr={0,0,0};
        List<Integer> list =new ArrayList<>() ;
        for (int i = 0; i < 3; i++) {
             //knr[i]= scan.nextInt();
            list.add(scan.nextInt());
        }System.out.println(list);
        System.out.println(list.get(0)==list.get(1)&&list.get(1)== list.get(2)?"eskenar":"degildir");
        /*
        if (list.get(0)==list.get(1)&&list.get(1)== list.get(2))
            System.out.println("eskenardır");
        else System.out.println("degildir");

         */

        //System.out.println(Arrays.toString(knr));


    }
}
