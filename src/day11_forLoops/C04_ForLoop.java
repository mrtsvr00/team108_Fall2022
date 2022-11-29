package day11_forLoops;

public class C04_ForLoop {
    public static void main(String[] args) {

        // eger sart i nin hicbir degeri icin true olmuyorsa,

        // input olarak verilen sayidan bire kadar tum sayilari yazdirin

        int input = 23;     // eger kullanicinin pozitif ve negatif girebilecegini ongorup
                            // ona gore kod yazmazsak, loop body'sinin hic calismamasi durumu olabilir

        if (input>1) {
            for (int i = input; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }else{
                for (int i = 0; i <=1 ; i++) {
                    System.out.println(i + " ");

                }

        }
        // eger sart i nin tum degerleri icin dogru oluyorsa
        // teknik olarak sonsuz loop olusur
        //bilgisayarimiz sonsuza kadar calismaz ram dolar veya int siniraina ulasir
        //ama teknik olarak sonsuz loop denir

        //input olarak verilen 100 e kadar tum tamsayilari yazdirin

        input=10;
        System.out.println("");
        for (int i = input; i <= 100 ; i++) {
            System.out.println(i + " ");

        }
    }
}
