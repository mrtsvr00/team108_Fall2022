package day12_methodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {


        //  Verilen iki sayiyi carpip sonucu yazdiran bir method olusturun.

        //  bir method ancak method call yapildiginda calisir.
        //  method call icin method adi ve parametrelere uygun argument yazilmalidir
        //  method call icerisinde yazilan variable veya degerlere argument denir.

        //carpYazdir("ali", "veli"); argument ve parametreler uyumlu degilse CTE olur.


        carpYazdir(5,8);
        carpYazdir(2,4);

    }

    public static void carpYazdir(int sayi1,int sayi2){
        System.out.println(sayi1*sayi2);


    }
}
