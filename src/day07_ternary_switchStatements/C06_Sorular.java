package day07_ternary_switchStatements;

public class C06_Sorular {
    public static void main(String[] args) {


        //// Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin",
        //// 50’den kucukse "Maalesef kaldin" yazdirin.

        int input=44;
        System.out.println(input>=50 ? "sinifi gectin" : "maalesef kaldin");




        //Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        //harf olarak yazdirin, yoksa girilen harfi yazdirin

        char karakter='a';

        System.out.println(karakter>='a' && karakter<='z' ? (char)(karakter-32) : karakter);

        //Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        int input1 =-56;

        System.out.println(input1<0 ? input1*-1 : input1);

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        int input2=120;
        int input3=35;

        System.out.println(input2>input3 ? input3 : input2);

    }
}
