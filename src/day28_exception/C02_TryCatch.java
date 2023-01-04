package day28_exception;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {


        /*
        Try-catch bloklarinin amaci
        riski 0 yapmak degil
        kodu iyi analiz yapip
        javanin cozemeyecegi durumlarada ne yapmasi istedigimizi kendisine soyelemektir

        Java try blogunda bas edemeyecegi bir sorunla karsilasirsa
        siz o sorunu deklare edinceye kadar
        yani catch() satirina kadar calismayi durdurur

        Bu durumda sorun olan satir ile catch satiri arasindaki kodlar calismaz.
         */


        // Kullanicidan iki sayi alip
        // sayilari birbirine bolup, sonucunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Birbirine bolmek icin iki tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        try {

            System.out.println("Iki sayinin bolumu : " + sayi1 / sayi2);

            System.out.println("kont1");
            System.out.println("kont2");
            System.out.println("kont3");

        } catch (ArithmeticException e){
            System.out.println("bolen sayi 0 olamaz");
            e.printStackTrace();
        }
    }
}
