package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        System.out.println(28/5);// 5

        System.out.println(29/3);// 9

        // Java bir bolme isleminde iki int iskleme giriyorsa sonucu int olarak verir.


        int sayi1=25;
        int sayi2=6;

        System.out.println(sayi1/sayi2);//4

        double dbl=6;
        System.out.println(sayi1/dbl);//4.166666666666667

        // Kullanicidan iki tamsayi alin.
        // 1.tamsayiyi 2.tamsayiya bolup sonucu ondalikli yazdirin.


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz");

        int sayi3= scan.nextInt();//2
        int sayi4= scan.nextInt();//4

        System.out.println("iki sayinin bolme sonucu : " + (double)sayi3/sayi4);//0.5




    }
}
