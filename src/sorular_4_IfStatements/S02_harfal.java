package sorular_4_IfStatements;

public class S02_harfal {

    public static void main(String[] args) {

        //

        char a = 'S';
        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            if (a == 'o' || a == 'O') {
                System.out.println("Ocak");
            } else if (a == 's' || a == 'S') {
                System.out.println("Subat");

            }
            System.out.println(1);
        }
        switch (a) {
            case 'a':
                System.out.println("Aralık");
                break;
            case'A':
                System.out.println("Aralık");
                break;
            case 'o':
                System.out.println("Ocak");
                break;
            case 'O':
                System.out.println("Ocak");
                break;
            case 's':
                System.out.println("Subat");
                break;
            case 'S':
                System.out.println("Subat");



        }


    }
}
