package day09_StringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        String str="Java ogrenen issiz kalmaz";

        System.out.println(str.endsWith("az"));//true

        System.out.println(str.endsWith("kalmaz"));//true

        System.out.println(str.endsWith("Java ogrenen issiz kalmaz"));//true

        System.out.println(str.endsWith(""));//true

        /*
        SORU : kullanicidan bir mail alin
  - mail @ icermiyorsa “gecersiz mail”
  - mail @gmail.com icermiyorsa, “mail gmail olmali”
  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
 yazdirin.
         */

        String mail="muratsever0000Q@gmail.com";

        if (!mail.contains("@")) System.out.println("gecersiz mail");
        else if (!mail.contains("@gmail.com")) System.out.println("mail gmail olmali");
        else if (!mail.endsWith("@gmail.com")) System.out.println("mailde yazim hatasi var");
        else System.out.println("mail basariyla kaydedildi.");

    }
}
