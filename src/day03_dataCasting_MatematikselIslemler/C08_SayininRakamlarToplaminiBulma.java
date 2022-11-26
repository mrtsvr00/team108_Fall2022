package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C08_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamakli bir sayi yaziniz");//1453

        int sayi= scan.nextInt();


        int birlerBas=0;
        int rakamlarToplami=0;

        birlerBas=sayi%10;//3
        rakamlarToplami=rakamlarToplami+birlerBas;//3
        sayi=sayi/10;//145

        birlerBas=sayi%10;//5
        rakamlarToplami=rakamlarToplami+birlerBas;//8
        sayi=sayi/10;//14

        birlerBas=sayi%10;//4
        rakamlarToplami=rakamlarToplami+birlerBas;//12
        sayi=sayi/10;//1

        birlerBas=sayi%10;//1
        rakamlarToplami=rakamlarToplami+birlerBas;//13
        sayi=sayi/10;//0

        System.out.println(rakamlarToplami);//13






    }
}
