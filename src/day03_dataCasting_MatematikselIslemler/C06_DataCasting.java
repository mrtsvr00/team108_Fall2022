package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli bir tamsayi yaziniz");
        double sayiDbl=scan.nextDouble();
        int sayiTam= scan.nextInt();

        System.out.println("sonuc : " + (int)(sayiDbl/sayiTam));



    }
}
