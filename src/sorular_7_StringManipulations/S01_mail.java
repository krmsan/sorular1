package sorular_7_StringManipulations;

import sorular_0ScannerCagirma.Scan;

public class S01_mail {
    //SORU : kullanicidan bir mail alin
    //- mail @ icermiyorsa "gecersiz mail"
    //- mail @gmail.com icermiyorsa, "mail gmail olmali"
    //- mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
    //yazdirin.
    public static void main(String[] args) {
        Scan obj = new Scan();
        String mail = obj.kelimeAl();
        if (!mail.contains("@")) {
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        } else System.out.println("mail: " + mail);
    }
}
