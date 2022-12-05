package day13_methodOverLoading;

import day12_methodCreation.C03_AsalSayi;
import day12_methodCreation.C07_TerseCevirme;
import day12_methodCreation.C09_FibonacciSayisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        //ilk 15 fibonacci sayisini yazdirin

        C09_FibonacciSayisi.fibonaccidenSayiYazdir(15);

        System.out.println("");

        //asagidaa verilen cumleyi tersine cevirin

        String str="Bir kere yaparim, yan gelir yatarim";
        System.out.println(C07_TerseCevirme.metniTerseCevir(str));//miratay rileg nay ,mirapay erek riB


        //verilen cumleyi tersine cevirin
        String tersStr= C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr);//miratay rileg nay ,mirapay erek riB

        // asagida verilen cumlenin palindrome olup olmadigini yazdirin

        str="Java Candir";

        tersStr=C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr))
            System.out.println("palindrome");
        else System.out.println("palindrome degil");

        // asagida verilen sayinin asal sayi olup olmadigini yazdirin

        int sayi=23;

        System.out.println(C03_AsalSayi.asalSayimi(23));//true

        // kullanici true false dan bir sey anlamaz diyorsaniz acik sekilde yazalim dersek

        boolean sonuc=C03_AsalSayi.asalSayimi(sayi);//true

        if (sonuc)
            System.out.println("Girilen " + sayi + "asal.");
        else
            System.out.println("Girilen " + sayi + "asal degil.");




    }
}
