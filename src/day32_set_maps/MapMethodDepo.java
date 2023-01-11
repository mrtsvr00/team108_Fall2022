package day32_set_maps;

import java.util.*;

public class MapMethodDepo {

    // bize ogrenciMap donduren bir method olusturun.

    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap();

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
        Collection<String> valuesCollection = ogrenciMap.values();


        // 2- for each kullanarak her bir value yu ele alalim Ali-Can-11-H-MF
        // 3- -'yi kullanarak split yaparim[Ali,Can,11,H,MF]
        // 4- split yaptigimiz array den isim bilgisini alalim 0.index
        // 5- eger valu'den aldigimiz isim aranan isim ile ayni ise
        //    true dondurup for each i bitirelim
        // 6- for each bittiginde true olmadiysa false dondurelim

        for (String eachvalue : valuesCollection
        ) {
            String[] valueArr = eachvalue.split("-");
            String valuedekiIsim = valueArr[0];

            if (valuedekiIsim.equalsIgnoreCase(isim)) {
                return true;

            }

        }
        return false;


    }

    public static void soyisimIleOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, String soyisim) {

        // 1- map'deki value'leri bir collection olarak kaydedelim
        //// [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]

        Collection<String> ogrenciValueCollection = ogrenciMap.values();
        //listenin ilk satiri olarak basliklari yazdiralim
        System.out.println("isim Soyisim Sinif Sube");
        // 2- for-each ile her bir value bilgisini ele alalim Ali-Can-11-H-MF
        // 3- value ile split yapip bir array ellde edelim [Ali,Can,11,H,MF]
        // 4- array'in 1.index'indeki soyisme bakip aranan soyisim ile ayni ise
        // isim,soyisim,sinif ve sube bilgilerini yazdiralim

        for (String eachValue : ogrenciValueCollection
        ) {

            String[] valueArr = eachValue.split("-");
            String valueSoyisim = valueArr[1];

            if (valueSoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[2] + " " +
                        valueArr[3]);
            }


        }
    }

    public static void SubeListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueCollection = ogrenciMap.values();

        System.out.println("Isim   Soyisim");

        for (String eachValue : valueCollection
        ) {

            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)) {

                System.out.println(valueArr[0] + "  " + valueArr[1]);
            }
        }
    }

    public static Map<Integer, String> numaraIleSubeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yeniSubeIsmi) {

        // 1- okul numarasini biliyoruz, direk ogrenci value'ye ulasabiliriz

        String ogrenciValue = ogrenciMap.get(okulNo); // Ayse-Can-10-H-MF

        String[] valueArr = ogrenciValue.split("-"); // [Ayse, Can, 10, H, MF]

        // 2- sube ismini guncelleyelim

        valueArr[3] = yeniSubeIsmi; //  [Ayse, Can, 10, M, MF]

        // 3- array'deki guncel bilgileri yeniden value formatinda bir String yapalim

        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" +
                valueArr[3] + "-" + valueArr[4];

        // 4- ogrenci no yani key ile yeni value'yu map'e ekleyelim

        ogrenciMap.put(okulNo, yeniValue);

        return ogrenciMap;
    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {
        // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun
        System.out.println("No  Isim  Soyisim  Bolum");
        System.out.println("==========================");
        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        for (Map.Entry<Integer, String> eachEntry : entrySeti
        ) { // 101=Ali-Can-11-H-MF
            // 1- entry'den value'yu alalim
            String entryValue = eachEntry.getValue(); // Ali-Can-11-H-MF
            // 2- bu value'yu parcalayalim ve bir array'e store edelim
            String[] valueArr = entryValue.split("-"); // [Ali, Can, 11, H, MF]
            // 3- sinif bilgisini kontrol edip
            //    istenen sinif ile ayni ise, istenen bilgileri yazdiralim
            if (valueArr[2].equalsIgnoreCase(sinif)) {
                System.out.println(eachEntry.getKey() + " " +
                        valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[4]);


            }
        }


    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {
        // verilen bolumdeki ogrencilerin
        // No, isim,soyisim ve siniflarini yazdiran
        // bir method olusturun
        System.out.println("No  Isim  Soyisim  Sinif");
        System.out.println("=========================");
        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        for (Map.Entry<Integer,String> eachEntry: entrySeti
        ) {
            String entryValue= eachEntry.getValue();
            String[] entryValueArr= entryValue.split("-"); // [Ali, Can, 11, H, MF]
            if (entryValueArr[4].equalsIgnoreCase("bolum")){
                System.out.println(eachEntry.getKey() + " " +
                        entryValueArr[0] + " " +
                        entryValueArr[1] + " " +
                        entryValueArr[2]);
            }



    }
    }

    public static Map<Integer, String> soyIsimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        // Map'deki soyisimleri buyuk harfe ceviren bir method olusturun
        // 1- entrySet olusturalim
        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        // 2- for-each loop ile her bir entry'i elden gecirip, soyisimleri buyuk harf yapalim
        for (Map.Entry<Integer, String> eachEntry : entrySeti) {
            // 3- entry'den value'yu alalim
            String entryValue= eachEntry.getValue(); // Ali-Can-11-H-MF

            // 4- soyisim bilgisine ulasip degistirebilmek icin parcala
            String[] enrtyValueArr= entryValue.split("-"); // [Ali, Can, 11, H, MF]
            //5-Soyismini buyuk harf yapalim

            enrtyValueArr[1]=enrtyValueArr[1].toUpperCase();// [Ali, Can, 11, H, MF]

            //6-degisikligi yaptiktan sonra yeniden birlestirmeler yapip
            // map i update etmeliyiz

            //7-setValue kullanarak value nun yeni haline update edelim

            eachEntry.setValue(enrtyValueArr[0]+"-"+
                               enrtyValueArr[1]+"-"+
                               enrtyValueArr[2]+"-"+
                               enrtyValueArr[3]+"-"+
                               enrtyValueArr[4]);




        }
        return ogrenciMap;

    }

    public static void tumListeYazdir(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("No Ogrenci Bilgileri");
        System.out.println("=========================");

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
    }
}

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {

        //mapte istedigimiz degisiklikleri yaptiktan sonra
        //


        Set<Map.Entry<Integer,String>> entrySeti =ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:entrySeti){

            String entryValue=eachEntry.getValue();//Ali, Can, 11, H, MF

            String[]entryValueArr=entryValue.split("-");//[Ali, Can, 11, H, MF]

            int sinifInt=Integer.parseInt(entryValueArr[2]);

            if (sinifInt==12){

                entryValueArr[2]="Mezun";
            }else{

                entryValueArr[2]=sinifInt+1+"";
            }

            // sinif bilgisini guncelledik
            // bu guncellemeyi map e islememiz lazim

            eachEntry.setValue(entryValueArr[0]+"-"+
                               entryValueArr[1]+"-"+
                               entryValueArr[2]+"-"+
                               entryValueArr[3]+"-"+
                               entryValueArr[4]);

        }
        return ogrenciMap;


    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        // 101=Ali-Can-11-H-MF
        // 11 H Ali Can 101

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal sirali olarak
        // Yazdiran bir method olusturun

        Set<Map.Entry<Integer, String>> entrySeti= ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti= new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String entryValue=eachEntry.getValue(); // Ali-Can-11-H-MF

            String[] entryValueArr= entryValue.split("-"); // [Ali, Can, 11, H, MF]

            // Entry'den istenen bilgileri alip yeni bir String olusturacagiz
            // ve bu String'leri sirali olarak yazdiracagiz

            String istenenFormattakiBilgi= entryValueArr[2]+" "+
                    entryValueArr[3]+" "+
                    entryValueArr[0]+" "+
                    entryValueArr[1]+" "+
                    eachEntry.getKey();

            siraliOgrenciSeti.add(istenenFormattakiBilgi);
        }

        System.out.println("sinif sube isim soyisim no");
        System.out.println("==========================");

        for (String each : siraliOgrenciSeti) {
            System.out.println(each);
        }

    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        // tum ogrenci listesini isim soyisim no sinif sube bolum

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> isimSoyisimSiraliSet= new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String value= eachEntry.getValue();

            String[] valueArr=value.split("-"); // [Ali, Can, 11, H, MF]

            String istenenFormattakiBilgi= valueArr[0]+" "+
                                           valueArr[1]+" "+
                                           eachEntry.getKey()+" "+
                                           valueArr[2]+" "+
                                           valueArr[3]+" "+
                                           valueArr[4];
            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);


        }

        // sirali set'i yazdiralim
        System.out.println("isim soyisim no sinif sube bolum");
        System.out.println("================================");

        for (String each : isimSoyisimSiraliSet) {
            System.out.println(each);
        }



    }
}


