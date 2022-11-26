package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tamsayi alin
        sayi rakam ise "girilen sayi rakam"
        sayi iki basamakli ise " girilen sayi 2 basamakli"
        sayi 2 basamaktan  buyukse" buyuk sayi " yazdirin
         */

        /*
        Eger IfElse cumleleri else ile bitmiyorsa tum durumlari kapsamaz.
        Yani bazi degerler icin hicbir If body si calismayabilir.
        bu tur sorulari cozerken sartlarin tamamini dikkatli yazmak gerekir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi=scan.nextInt();

        if (0<=girilenSayi && girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=girilenSayi && girilenSayi<=99) System.out.println("girilen sayi iki basamakli sayi");
        else if (girilenSayi>=100) System.out.println("Buyuk sayi");
    }
}
