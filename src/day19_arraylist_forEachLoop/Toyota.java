package day19_arraylist_forEachLoop;

public class Toyota {

    String marka = "Toyota";
    String model = "Model belirtilmemis";
    int yil;
    int km;
    String renk;
    // default constructor suna benzer

    Toyota(){
        System.out.println("Toyota class'indaki cons.calisti.");

    }
    /*
        Bir kod blogunun constructor olup olmadiginin anlamak icin
        2 seye bakmaliyiz

        Constructor class ismi ile ayni isimde olmalidir.
        (dolayisiyla cons. isimleri buyuk harfle baslar)
     */

    /*
        Java'da her calass obje uretmek uzere olusturulur

        bir obje olusturulup, ilk deger atamasi yapilabilmesi icin de
        MUTLAKA constructor calismalidir.

        Java'da her class'da mutlaka CONSTRUCTOR bulunur.

        Her class'da bizim constructor olusturmamiza gerek kalmamasi icin
        Java her class'a otomatik olarak default constructor koyar.

        default constructor GORUNMEZ
        parametresi olmayan ve body'sinde hic kod bulunmayan bir constructor'dir.

        Bir class'da gozlerimizle bir constructor gormuyorsak
        o class'da default constructor vardir.

        eger kullanicilar tarafindan gozle gorunur bir
        constructor olusturulursa Java default constructor'i siler.
        yani gozlerimizle bir constructor goruyorsak o class'da default constructor yoktur.
     */
}
