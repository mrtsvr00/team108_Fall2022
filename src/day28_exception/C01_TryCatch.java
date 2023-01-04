package day28_exception;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {


        // Kullanicidan iki sayi alip
        // sayilari birbirine bolup, sonucunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Birbirine bolmek icin iki tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        try {
            // try bolumu : yapmak istedigimiz ama exception riski olusturan kodlar
            System.out.println("iki sayinin bolumu : " + sayi1/sayi2);
        } catch (ArithmeticException e) {
            // catch () : bekledigimiz muhtemel exeption ve
            //            bu exception gerceklesirsse hata dokumaninin store edebilecegimiz variable


            System.out.println("Bolecek sayi 0 olmamaz");
            e.printStackTrace();
            throw new RuntimeException(e);
            // catch blogu : exception gerceklesirse calismasii istedigimiz kodlar
            //               burayi yazarkrn oncelikle
            //               exp/olustugunda kodlarin calismasi dursunmu ? yoksa devam etsinmi
            //               karar vermeliyiz
        }
    }
}
