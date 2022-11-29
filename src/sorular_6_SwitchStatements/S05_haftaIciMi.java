package sorular_6_SwitchStatements;

public class S05_haftaIciMi {
    //Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
    public static void main(String[] args) {
        int i = 6;
        String[] hafta = {"", "pazartesi", "sali", "carsamba", "persembe", "cuma", "cumartesi", "pazar"};
        switch (i) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println(hafta[i]+" hafta icidir");
                break;
            case 6: case 7:
                System.out.println(hafta[i]+" hafta sonudur");
                break;
            default:
                System.out.println("yanlıs giriş");
        }
    }
}
