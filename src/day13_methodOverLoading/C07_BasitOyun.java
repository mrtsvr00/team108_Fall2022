package day13_methodOverLoading;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {
        /*
        random olarak 1 ile 100 arasinda bir sayi olusturun
        kullanicidan bu sayiyi bilmesini isteyin
        kullanici her deger girdiginde
        tuttugumuz sayi ile karsilastirip tahminin buyult veya kucult diyelim
        kullnici tutugumuz sayiyi bildiginde tahmin sayisini ve

        -3 veya daha az tahminde bildiyse "Waowww"
        -4 - 8 tahminde bildiyse "aferin"
        daha fazla tahminde bildiyse basarisiz yazdirin
         */
        Scanner scan=new Scanner(System.in);

        Random rnd=new Random();
        int tutulanSayi= rnd.nextInt(5);

        int tahminSayi = 0;
        int sayac = 1;


        while(tahminSayi != tutulanSayi){
            System.out.println("Lutfen bir sayi giriniz");
            tahminSayi=scan.nextInt();


            if (tutulanSayi==tahminSayi){
                System.out.println(sayac + " tahmin ile tuttugun sayiyi buldum");
                if (sayac<=3){
                    System.out.println("waoww");
                } else if (sayac<=8){
                    System.out.println("aferin");

                }else{
                    System.out.println("basarisiz");
                }
                break;
            }else if (tahminSayi<tutulanSayi){
                System.out.println("Sayiyi buyult");
                sayac++;
            }else {
                System.out.println("sayiyi kucult");
                sayac++;
            }



                }
            }


        }

