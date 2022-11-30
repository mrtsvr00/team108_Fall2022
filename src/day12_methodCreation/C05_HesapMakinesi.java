package day12_methodCreation;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {

        // Kullanicidan iki sayi ve istedigi islemi alin
        // bir method olusturup sayilari istenen islemi uygulayip
        // sonucu bize dondurun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("Lutfen istediginiz bir islemi giriniz + ,-,*,/");
        char islem = scan.next().charAt(0);

        System.out.println(hesapMakinasi(sayi1, sayi2, islem));
        int sonuc=hesapMakinasi(5, 6, '*');
        System.out.println(sonuc);//30


    }

    public static int hesapMakinasi(int sayi1, int sayi2, char islem) {


        switch (islem) {
            case '+':
                return sayi1 + sayi2;

            case '-':
                return sayi1 - sayi2;

            case '*':
                return sayi1 * sayi2;

            case '/':
                return sayi1 / sayi2;

            default:
                return 0;


        }
    }
}





