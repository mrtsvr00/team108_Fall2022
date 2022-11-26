package day09_StringManipulation;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str="Javayi iyi ogrenmek icin cok calismam lazim cok.";

        // ilk anin indexini yazdiralim

        System.out.println(str.indexOf("a"));//1

        // son anin indexini yazdiralim

        System.out.println(str.lastIndexOf("a"));//39

        System.out.println(str.lastIndexOf("a", 15));

        //verilen str da cok kelimesininkullanimini kontrol edip
        //- cok kelimesi kullanilmamis
        //- bir kere kullanilmis
        //-birden fazla kullanilmis
        // sonuclardan uygun olani yazdir

        String str1="Javayi iyi ogrenmek icin cok calismam lazim cok";
        int ilkIndex=str.indexOf("cok");
        int sonIndex=str.lastIndexOf("cok");

        if ((!str1.contains("cok"))) System.out.println("cok kelimesi kullanilmamis");
        else if (ilkIndex==sonIndex) System.out.println("cok kelimesi bir kere kullanilmis");
        else System.out.println("cok kelimesi birden fazla kullanilmis");




    }
}
