package day16_arrays;

import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {
        // Kullanicidan yeni isimler alip var olan Arraye ekleyen bir method olusturun.
        // kullanici yeni deger verdigi muddetce C10 daki hazir methodu kulanarak eklemeye devem edin
        // kullanici 0 a bastiginda array in son halini dondurun

        String[] isimler = {"kamil"};
        String eklenecekIsim = "";

        System.out.println(isimEkle(isimler, eklenecekIsim));


    }

    public static String[] isimEkle(String[] isimler, String eklenecekIsim) {
        Scanner scan = new Scanner(System.in);


        while (eklenecekIsim != "Yeter") {
            System.out.println("lutfen isim giriniz\nbitince 0'a basiniz");
            eklenecekIsim = scan.nextLine();

            C10_ArrayeBirElementBekleme.elementEkle(isimler, eklenecekIsim);



        }
        return isimler;
    }
}