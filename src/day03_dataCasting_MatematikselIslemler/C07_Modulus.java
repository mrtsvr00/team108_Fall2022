package day03_dataCasting_MatematikselIslemler;

public class C07_Modulus {
    public static void main(String[] args) {


        // % Modulus : Java da bolme islemi sonucunda kalan sayiyi verir

        System.out.println(15%4);//3

        System.out.println(45%4);//1

        /*
         kullanicinin girdigi deger cift sayimi
         girilen sayi % 2 isleminin sonucu 0 ise cift sayidir

         kullanicinin girdigi sayi 7 nin katimi
         girilensayi % 7 isleminin sonucu 0 ise 7 nin katidir

         kullanicinin girdigi sayinin birler basamagi
         kullanici 3426 girdi
         */



        int girilenSayi=3426;
        int birlerBas=girilenSayi%10;//6
        System.out.println("Birler Basamagi : " + birlerBas);

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);//342

        birlerBas=girilenSayi%10;//2
        System.out.println("Birler Basamagi : " + birlerBas);

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);//34

        birlerBas=34%10;//4
        System.out.println("Birler Basamagi : " + birlerBas);

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);//3

        birlerBas=3%10;//3
        System.out.println("Birler Basamagi : " + birlerBas);

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);//0




    }
}
