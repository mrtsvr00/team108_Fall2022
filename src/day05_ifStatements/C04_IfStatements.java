package day05_ifStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        /*
           if cumlelerinde sart parantezinden sonra body kullanmazsak
           ilk ;'e kadar olan kismi body olarak kabul eder
           yani sadece 1 satir kodu body olarak kabul eder
         */

        //Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%3==0)
            System.out.println("3 ile bolunur");

        if (sayi%5==0)
            System.out.println("5 ile bolunur");



    }
}
