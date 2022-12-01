package day13_methodOverLoading;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere sayi alin girilen sayilari toplami 500 olur veya gecerse
        // bu kadar sayi yeter deyip toplami yazdirin

        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int toplam=0;

        for (int i = 1; i < 1000; i++) {
            System.out.println("Toplamak uzere tamsayi giriniz");
             sayi=scan.nextInt();
             toplam+=sayi;

             if (toplam>=500) System.out.println("bu kadar sayi yeter. Toplamlari " + toplam + "oldu");
             break;
        }

        System.out.println("");

        toplam=0;
        sayi=0;

        while(toplam<500) {
            System.out.println("Toplamak uzere tamsayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("bu kadar sayi yeter. Toplamlari " + toplam + "oldu");




    }
}
