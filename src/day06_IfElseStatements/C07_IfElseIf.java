package day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {


        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilo(kg) giriniz");
        int kg= scan.nextInt();
        System.out.println("Lutfen boyunu(cm) giriniz");
        int boy= scan.nextInt();
        double vke=kg*10000 / (boy*boy);

        System.out.println("Vucud Ktle Indeksiniz : " + vke);
        if (vke>30) System.out.println("obez");
        else if (vke>25) System.out.println("kilolu");
        else if (vke>20) System.out.println("normal");
        else if (20>vke) System.out.println("zayif");

    }
}
