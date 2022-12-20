package day23_dateTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        topla(5,8);
        topla(5,7,3);
        topla(7, 3,4,6);

    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("uc sayinin toplami : " + (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("iki sayinin toplami : " + (sayi1+sayi2));
    }
}
