package day32_set_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    // bize ogrenciMap donduren bir method olusturun.

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String>ogrenciMap= new HashMap();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;

    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        // 1- tum value 'leri bir collection olarak kaydedelim.
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection =ogrenciMap.values();


        // 2- for each kullanarak her bir value yu ele alalim Ali-Can-11-H-MF
        // 3- -'yi kullanarak split yaparim[Ali,Can,11,H,MF]
        // 4- split yaptigimiz array den isim bilgisini alalim 0.index
        // 5- eger valu'den aldigimiz isim aranan isim ile ayni ise
        //    true dondurup for each i bitirelim
        // 6- for each bittiginde true olmadiysa false dondurelim

        for (String eachvalue:valuesCollection
             ) {
            String[]valueArr=eachvalue.split("-");
            String valuedekiIsim=valueArr[0];

            if (valuedekiIsim.equalsIgnoreCase(isim)){
                return true;

            }

        }
       return false;


    }

    public static void soyisimIleOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, String soyisim) {

        // 1- map'deki value'leri bir collection olarak kaydedelim
        //// [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]

        Collection<String>ogrenciValueCollection=ogrenciMap.values();
        //listenin ilk satiri olarak basliklari yazdiralim
        System.out.println("isim Soyisim Sinif Sube");
        // 2- for-each ile her bir value bilgisini ele alalim Ali-Can-11-H-MF
        // 3- value ile split yapip bir array ellde edelim [Ali,Can,11,H,MF]
        // 4- array'in 1.index'indeki soyisme bakip aranan soyisim ile ayni ise
        // isim,soyisim,sinif ve sube bilgilerini yazdiralim

        for (String eachValue:ogrenciValueCollection
             ) {

            String []valueArr=eachValue.split("-");
            String valueSoyisim=valueArr[1];

            if (valueSoyisim.equalsIgnoreCase(soyisim)){
                System.out.println(valueArr[0] + " " +
                                  valueArr[1] + " " +
                                  valueArr[2] + " " +
                                  valueArr[3]);
            }



        }
    }
}
