package day10_stringManipulations;

public class C08_ForLoop {
    public static void main(String[] args) {

        // 1 ve 1000 arasindaki sayilari yanyana yazdirin.
        //yazdirma islemi bittiginde " tum bu sayilarin toplami = " deyip sayilarin toplamini yazdirirn
        int toplam=0;

        for (int i = 1; i <1000 ; i++) {
            System.out.print(i + " ");
            toplam+=i;

        }
        System.out.println("");
        System.out.println("tum bu sayilarin toplami: " + toplam);
    }
}
