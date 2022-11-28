package sorular_6_SwitchStatements;

import sorular_0ScannerCagirma.Scan;

public class S04_ISTQBacilimi extends Scan {

    //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istediginizi alin
    //ve girilen harfin karsiligini yazdirin.
    // I : International S : Software T : Testing Q : Qualifications B: Board
    public static void main(String[] args) {

        Scan obj=new Scan();

        switch (obj.harfAl()) {
            case 'I':
            case 'i': System.out.println("International");
                break;
            case 'S':
            case 's': System.out.println("Software");
                break;
            case 'T':
            case 't': System.out.println("Testing");
                break;
            case 'Q':
            case 'q': System.out.println("Qualifications");
                break;
            case 'B':
            case 'b': System.out.println("Board");
                break;
            default: System.out.println("gecersiz harf girdiniz");

        }

    }
}
