package day06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        // //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen ikizkenar ise
        //           “ikizkenar ucgen” yazdirin, degilse “ikizkenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();


        if ((kenar1==kenar2 && kenar2!=kenar3) ||
            (kenar2==kenar3 && kenar2!=kenar1) ||
            (kenar3==kenar1 && kenar3!=kenar2))
            System.out.println("ikizkenar Ucgen");
        else
            System.out.println("Ikizkenar Ucgen Degil");
    }
}
