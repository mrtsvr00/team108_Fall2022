package day13_methodOverLoading;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        toplama(5.4, 6.3);//2 double sayi toplami :11.7
        toplama('a', 'b');//int ve double toplami :195.0

        //ilk olarak %100 uyumlu parametre arar
        //eger %100 uyumlu yoksa calisabilecek method varmi diye kontrol eder
        // calisacak method birden fazla olursa minimum casting yaparak kullanabilecegini tercih eder

        toplama(8.4, 6);//2 double sayi toplami :14.4


    }

    public static void toplama(int sayi2, double sayi1) {
        System.out.println("int ve double toplami :" + (sayi1 + sayi2));
    }

    public static void toplama(double sayi1, double sayi2) {
        System.out.println("2 double sayi toplami :" + (sayi1 + sayi2));
    }
}
