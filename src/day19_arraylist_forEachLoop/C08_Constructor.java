package day19_arraylist_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_Constructor {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        // sayilar ArrayList classindan olusturdugumuz bir objedir.
        // ve olusturuldugu class daki tum ozelliklere (method ve variable'lar) sahiptir.

        /*
        bir class dan bir obje olusturdugumuzda
        o class daki tum instance variable larin bir kopyasi olusturulup
        objemizle iliskilendirilir


        ayrica o classda bulunan tum methodlarda objemizle iliskilendirilir

        Bu islemleri saglayan java yapisi CONSRUCTOR'dir.
        bu isleme de initiliaza (ilk deger atamasi) denir.

        new keyword ile obje olusturulurken
        esitligin saginda new ile birlikte classIsmi yazilir.

        iste bu classIsmi() o class in constructoridir.
        constructor bugune kadar gordugumuz yapilardan farklidir.

        Constructor bir obje olusturmak istedigimizde devreye girer
        ve ilgili sinifin ozelliklerini obje ile iliskilendirir. (initialize)
         */
    }
}
