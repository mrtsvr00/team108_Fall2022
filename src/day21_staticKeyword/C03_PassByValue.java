package day21_staticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {


        int sayi=20;

        System.out.println(sayi);

        //int sayi=30;
        // bir scope da tanimlanan varialein yeniden tanimlanma imkani yoktur.

        //String sayi="hasan";
        //data tutunun degistirilmeside yeniden tanimlamakta mumkun degildir
        //cunku kullanirken variable in ismini yazdigimizda hangi sayi variable ini kullabnacagi mechul olur.

        method1();
    }


    public static void method1(){
        String s="Hasan";
        method2(5);

        System.out.println(s.toLowerCase());// hasan
    }

    public static void method2(int s){
        s=s*s;
        System.out.println(s);

    }
}
