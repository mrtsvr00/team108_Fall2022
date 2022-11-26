package day08_StringManipulation;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";
        System.out.println(str.length());// karakter sayisi : 19

        //  Metnin tam ortasindaki karakter nedir
        System.out.println(str.charAt(str.length()/2));//n

        // son karakteri yazdirin

        System.out.println(str.charAt(str.length()-1));//p

        // bir karakteri degilde verilen String in icerdigi bir metin parcasini elde etmek istersek
        //ornegin " ogren" kelimesini yazdiralim

        System.out.println(str.substring(5, 10));//ogren
        // substring(bas,bitis) methodunda
        // baslangic olarak yazilan index dahil(inclusive)
        // bitis olarak yazilan index haric (exclusive)`dir
        System.out.println(str.substring(5,10));//ogren

        // str dan "java" kelimesini yazdiralim
        System.out.println(str.substring(0,4));//Java

        // str dan kap yazdiralim
        System.out.println(str.substring(16));
        System.out.println(str.substring(16,19));
        System.out.println(str.substring(str.length()-3));//kap

        //substring kullanara sadece j harfini yazdirin
        System.out.println(str.substring(0,1));//J

        //  substring kullanarak 9.indexteki harfi buyuk olarak yazdirin
        System.out.println(str.substring(9, 10).toUpperCase());//N
        System.out.println(str.charAt(9));//n
        //charAt() kullanmak yerine substring kullanmak daha avantajli olabilir
        //cunku substring kullaninca ifade hala string oldugundan
        //method kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5));//hiclik yazdirir yani konsolda bos bir satir olusur

        //System.out.println(str.substring(4,3));//StringIndexOutOfBoundsException

        //System.out.println(str.substring(25,28));//StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()));//hiclik yazdirir
        //System.out.println(str.charAt(str.length()));//StringIndexOutOfBoundsException
        System.out.println(str.substring(str.length()+1));//StringIndexOutOfBoundsException
        System.out.println("==========================");

    }
}
