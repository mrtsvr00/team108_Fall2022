package day32_set_maps;

import java.util.Map;

public class C07_SoyisimIleOgrenciArama {
    public static void main(String[] args) {

        // ogrenci map'te aradigimiz soyisimdeki ogrencilerin
        // isim,soyisim,sinif ve sube bilgilerini
        // bir tablo olarak yazdiran bir method olusturun

        Map<Integer,String>ogrenciMap =MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimIleOgrenciListesiYazdir(ogrenciMap,"Can");

    }
}
