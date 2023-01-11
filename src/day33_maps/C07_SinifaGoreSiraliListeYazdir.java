package day33_maps;

import day32_set_maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdir {
    public static void main(String[] args) {

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogalsirali olarak
        // yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifSiraliListeYazdir(ogrenciMap);
    }
}
