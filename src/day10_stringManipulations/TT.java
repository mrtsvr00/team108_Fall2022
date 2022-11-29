package day10_stringManipulations;

import org.w3c.dom.ls.LSOutput;

public class TT {
    public static void main(String[] args) {

        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin

        int inputBas=1;
        int inputBit=58;
        int toplam=0;
        int sayac=0;

        for (int i = inputBas; i < inputBit; i+=7) {
            System.out.print(i + " ");
            toplam+=i;
            sayac++;


        }
        System.out.println("");
        System.out.println(sayac + " adet sayinin \ntoplami : " + toplam);

        }
    }

