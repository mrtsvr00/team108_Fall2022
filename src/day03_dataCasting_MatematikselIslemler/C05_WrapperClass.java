package day03_dataCasting_MatematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {


        int sayi=10;
        String str="Java candir";

        /* int primite oldugundan hazir methodlari yoktur.
         String non primitive oldugu icin hazir methodlara sahiptir.

         int , char boolean gibi primitive data turlerinde hazir method kulanmak icin Java Integer ;Character ,Boolean gibi wrapper class lar olusturmustur

         bunlar primitivelerle ayni degerleri alabilir
         ama extradan methodlarida vardir.
         */
        Integer sayi2=20;
        /*
        Islemlerimizi yaparken bazen String olarak tanimlanmis,
        ancakmatematiksel icerik barindiran variable lar ile karsilasabiliriz
        Bu durumda bu tur String variablelari ayiya cebvirmek ihtiyacimiz olabilir

        Eger sayiya cevirmek istedigimiz metinlerde
        harf veye sayi olmayan baska karakter varsa
        Java hata verir.
         */
        String str2="123";
        String str3="354";

        // int str2Int=(int)str2;
        int str2Int=Integer.parseInt(str2);
        int str3Int=Integer.parseInt(str3);

        System.out.println(str2+str3);//123354 String toplama oldu
        System.out.println(str2Int+str3Int);//477 Stringler int a donustu(parseInteger)

        String str4="6262626";
        int str4Int=Integer.parseInt(str4);
        System.out.println(str4);

        System.out.println(Integer.MIN_VALUE);// -2147483648
        System.out.println(Integer.MAX_VALUE);// 2147483647

        char krk1='$';

        System.out.println(Character.isDigit(krk1));//false
        System.out.println(Character.isLetter(krk1));//false
        System.out.println(Character.isAlphabetic(krk1));//false
        System.out.println(Character.isLetterOrDigit(krk1));//false

        short sayi3=4;
        int sayi5=sayi3;

        //WRAPPER CLASSLARDA CASTING olmaz.
        Short sayi6=45;
        //Integer sayi7=(Integer) sayi6;


    }
}
