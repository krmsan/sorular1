package sorular_1_valueof_parseInt;

public class S03 {
    public static void main(String[] args) {
        String s="123457";

        int s1=Integer.parseInt(s);
        System.out.println(s1);//123457
        int s2=Integer.valueOf(s);            //farkları ne
        System.out.println(s2);//123457
    }
}
