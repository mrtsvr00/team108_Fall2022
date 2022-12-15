package day20_constructor;

public class Rope {

    public static void swing() {
        System.out.println("swing ");
    }
    public void climb() {
        System.out.println("climb ");
    }
    public static void play(){
        swing();
        // climb();
    }
    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null; // instance variable yok
        rope2.play();      // instance variable olsaydi ve rope2 uzerinden instance ile ilgili islem
        // yapsaydik NULL POINTER EXCEPTION verirdi

    }
}
