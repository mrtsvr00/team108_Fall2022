package day08_StringManipulation;

import java.util.Locale;

public class    C02_toUpperCaseLocale {
    public static void main(String[] args) {


        String str="JAVA CANDIR";

        System.out.println(str.toLowerCase());//java candir

        str=str.toLowerCase(Locale.forLanguageTag("tr"));//java candır
        System.out.println(str);

        str="sevgi insanı hayata bağlar";

        System.out.println(str.toUpperCase());//SEVGİ İNSANI HAYATA BAĞLAR

        str=str.toUpperCase(Locale.forLanguageTag("Tr"));//SEVGİ İNSANI HAYATA BAĞLAR
        System.out.println(str);//
    }
}

