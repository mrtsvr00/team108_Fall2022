package day12_methodCreation;

public class C01_Method {
    public static void main(String[] args) {

        // methodlar bazen cok basit islemleri bazende kompleks islemleri yapabilir
        // biz o islemleri nasil yapabiliriz diye dusunmek yerine hazir method 'u kullnmayi tercih ederiz.
        // bizden sonra o kodu inceleyecek kisiler de hazir method isimlerinden ne yapmak istedigimizi kolayca anlayabilirler.
        // ayrica kodu her yazdigimizda yapabilecegimiz muhtemel hatalardan kurtulmus oluruz.

        String str="Java'da yolu yariladik";

        str.isEmpty();// boolean sonuc dondu ama kullanmadik
        // method'un dondurdugu sonucu kullanmak isterseniz
        // ya yazdirirsiniz


        System.out.println(str.isBlank());// false

        //ya da donen sonucu ileride kullaacaksak atama yapabilirim.



        String buyukFarfHali=str.toUpperCase();
    }
}
