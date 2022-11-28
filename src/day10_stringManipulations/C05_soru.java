package day10_stringManipulations;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir cumle alin
        //  - cumlede ev geciyorsa, “home home sweet home” yazdirin
        //  - cumlede is geciyorsa, “calismak guzeldir”
        //  - ikisini de iceriyorsa “Hem ev lazim hem is”
        //  - hicbirini icermiyorsa “cok calisman lazim” yazdirin

        String str="evden calisiyorum,ise gitmeye gerek yok";
        String calisacakStr=str.toLowerCase();

        if (calisacakStr.contains("ev") &&calisacakStr.contains(" is"))System.out.println("Hem ev lazim hem is");
        else if (calisacakStr.contains(" is")) System.out.println("calismak guzeldir");
        else if (calisacakStr.contains("ev")) System.out.println("home home sweet home");
        else System.out.println("cok calisman lazim");
    }


}
