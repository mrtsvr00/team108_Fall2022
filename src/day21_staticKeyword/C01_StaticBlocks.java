package day21_staticKeyword;

public class C01_StaticBlocks {
    C01_StaticBlocks(){
        System.out.println("Constructor calisti");

    }

    public static void main(String[] args) {
        System.out.println("main method calismaya basladi");
    }

    static {

        // static blocklar class daki tum yapilardan, hatta main method'dan bile once calisir.
        // static blockta istedigimiz variable a baslangic degerinin atanmasi
        // kullanicidan yetki sorulmasi gibi islemler yapilabilir.
        // main method calismadan once yapilmasi gereken islem oldugunda kullanilir.
        // methodlarin ve static blocklarin siralamasi java acisindan onemli degildir.
        // ancak birden fazla static block varsa,kendi aralarinda once ustteki calisir.

        System.out.println("static blok calisti");

    }

    static {

        System.out.println("alttaki static blok calisti");
    }
}
