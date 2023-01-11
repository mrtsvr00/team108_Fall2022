package day33_maps;

import day32_set_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyIsimleriBuyukHarfYapma {
    public static void main(String[] args) {
        //Map’deki soyisimleri buyuk harfe cevirin.

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap=MapMethodDepo.soyIsimleriBuyukHarfYap(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);

        //11'inci Siniflari yazdir

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap, "11");


    }
}
