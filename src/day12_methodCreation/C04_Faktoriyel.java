package day12_methodCreation;

public class C04_Faktoriyel {
    public static void main(String[] args) {

        //  verilen bir sayinin 15'den kucuk bir pozitif tamsayi oldugunu kontrol edin
        //  kucukse bir method olusturup, faktoryel degerini yazdirin

        int sayi=16;

        if (sayi>0 && sayi>15)
        faktoryel(sayi);

        else System.out.println("15 den kucuk tamsayi olmalidir");


    }

    public static void faktoryel(int sayi){
        int faktoryelDegeri=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryelDegeri*=i;

        }
        System.out.println("Girilen" + sayi + " icin faktoryel : " + faktoryelDegeri);



    }

}
