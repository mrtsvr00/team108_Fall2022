package day04_increment_concatination;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {


        int sayi=20;

        // sayiyi 3 artirin

        sayi=sayi+3;

        sayi+=3;

        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi);//29

        //sayinin degerini iki azaltin

        sayi=sayi-2;

        sayi-=2;

        sayi--;
        sayi--;

        System.out.println(sayi);//23

        sayi=10;
        //sayinin degerini 1 azaltin ve yazdirin.

        sayi--;
        System.out.println(sayi);//9

        sayi=10;
        //sayiyi once yazdirin sonra 1 azaltin
        System.out.println(sayi);//10
        sayi--;

        //ekranda gorulen 10 ,ama sayinin son degeri 9
        System.out.println(sayi);//9

        sayi=10;
        // java ayni satirda iki islem oldugundan siralama yapar
        //eger ++ variable dan sonra ise artirma islemini yapar
        //bu durumda once yazdirma ,sonra artirma islemini yapar
        System.out.println(sayi++);//10

        sayi=10;
        System.out.println(++sayi);//11
        //eger ++ variable dan once ise artirma islemini yapar
        //bu durumda once artirma ,sonra yazdirma islemini yapar





    }
}
