package day05_ifStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {


        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        if (harf=='O' || harf=='o') System.out.println("Ocak");

        if (harf=='S' || harf=='s') System.out.println("Subat");

        if (harf=='M' || harf=='m') System.out.println("Mart,Mayis");

        if (harf=='N' || harf=='n') System.out.println("Nisan");

        if (harf=='H' || harf=='h') System.out.println("Haziran");

        if (harf=='T' || harf=='t') System.out.println("Temmuz");

        if (harf=='A' || harf=='a') System.out.println("Agustos,Aralik");

        if (harf=='E' || harf=='e') System.out.println("Eylul, Ekim");

        if (harf=='K' || harf=='k') System.out.println("Kasim");



    }
}
