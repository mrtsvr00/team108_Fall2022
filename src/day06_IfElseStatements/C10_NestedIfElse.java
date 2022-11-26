package day06_IfElseStatements;

import java.util.Scanner;

public class C10_NestedIfElse {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen urun adedini giriniz");
        int urunAdedi=scan.nextInt();
        System.out.println("Urunun liste fiyatini giriniz");
        double listeFiyati= scan.nextDouble();
        System.out.println("musteri Kartiniz varmi\nE:Evet H:Hayir");
        char kartVarmi=scan.next().charAt(0);


        if (kartVarmi=='E') {
            if (urunAdedi <= 0) {
                System.out.println("Hatali Giris");
            } else if (urunAdedi > 10) {
                System.out.println("%20 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.8);
            } else System.out.println("%15 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.85);

        }else if (kartVarmi=='H') {
            if (urunAdedi <= 0) {
                System.out.println("Hatali Giris");
            } else if (urunAdedi > 10) {
                System.out.println("%15 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.85);
            } else System.out.println("%10 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.9);

        }else{
                System.out.println("Hatali Kart Girisi");

        }
    }
}
