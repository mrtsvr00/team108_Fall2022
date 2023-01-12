package day33_maps;

import day32_set_maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArtirma {
    public static void main(String[] args) {
        // ogrenci map'indeki tum sinif degerlerinin bir artirin
         // 12'nci sinifta olan varsa sinif bilgisini mezun yapin

        Map<Integer,String>ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.siniflariArtir(ogrenciMap);

    }
}