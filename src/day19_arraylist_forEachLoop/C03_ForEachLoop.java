package day19_arraylist_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        /*

        Eger coklu element iceren yapidaki tum elementlere ayni islemi yapmak istiyorsak
        indeksten bagimsiz olarak for each loop kullanilabilir

        for each loop ta 3 seyi belirtmemeiz gerekir
        1-getirilecek eklementlerin data turu
        2-getirilen elemente verilecek isim (genelde each veya w kullanilir)
        3-nereden getirilecegi

         */



        int []arr= {2,4,6,8,1};

        // bu array in tum elemntlerini yazdiralim

        for (int each: arr
             ) {

            System.out.print(each+ " ");

        }

        // tum elementleri toplayalim
        int toplam=0;

        for (int each:arr
             ) {
            toplam+=each;

        }
        System.out.println("");

        System.out.println(" sayilarin toplami : " + toplam);


        // tum sayilarin toplami
        toplam=0;

        for (int each :arr
             ) {

            toplam+=each*each;

        }
        System.out.println("sayilarin kareleri toplami : " +  toplam);

    }
}
