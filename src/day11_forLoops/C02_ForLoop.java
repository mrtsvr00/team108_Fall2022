package day11_forLoops;

public class C02_ForLoop {
    public static void main(String[] args) {

        //input olarak verilen bir string de indexi tek sayi olanlari kucuk harfle
        // indexi cift sayi olanlari buyuk harfle yazdirin

        String str="java candir, Selenyum heyecandir";

        for (int i = 0; i <=str.length()-1 ; i++) {
            System.out.print(i%2==0
                               ? str.substring(i,i+1).toUpperCase()
                               : str.substring(i,i+1).toLowerCase()
                               );

        }
    }
}
