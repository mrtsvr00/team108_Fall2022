package day10_stringManipulations;

public class C09_ForLoop {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degerlerini alip bu sinirlar dahil olarak bu sayilar arasinda 5 in kati sayilari yazdirin

        int basDeger=0;
        int bitDeger=775;
        int sayac=0;

        for (int i = basDeger; i <=bitDeger ; i++) {
            if (i%5==0) System.out.print(i + " ");


        }


    }
}
