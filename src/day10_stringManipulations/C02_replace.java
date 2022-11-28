package day10_stringManipulations;

public class C02_replace {
    public static void main(String[] args) {

        String str= "Java ogren, adana ye :) ";

        System.out.println(str.replace('a','A'));//JAvA ogren, AdAnA ye :)

        System.out.println(str.replace(" ",""));//Javaogren,adanaye:)

        System.out.println(str.replace("Java", "Yazilim"));//Yazilim ogren, adana ye :)

        String telefon="555 3451234";
        System.out.println(telefon.replace("555", "532"));

        System.out.println(telefon.replace("5", "3"));

        String sonuc= "1-16 of over 100,000 results for \"apple\"";


        int overIndexi=sonuc.indexOf("over");
        int resultIndex=sonuc.indexOf("results");

        String sonucSayisiStr=sonuc.substring(overIndexi+5,resultIndex-1);
        System.out.println(sonucSayisiStr);

        sonucSayisiStr=sonucSayisiStr.replace(",","");

        System.out.println(sonucSayisiStr);

        int sonucSayisiInt=Integer.parseInt(sonucSayisiStr);//String 100000i int 100000 e cevirir

        if (sonucSayisiInt>10000)
            System.out.println("arama sonuc testi PASSED");
        else
            System.out.println("arama sonuc testi FAILED");


    }
}
