package day11_forLoops;

public class C01_ForLoop {
    public static void main(String[] args) {

        // kullanicidan bir char alip
        // o karakterden sonra gelen 10 karakteri yazdirin

        char ilkHarf='a';

        for (int i = 1; i <=10; i++) {
            System.out.print((char)(ilkHarf+i) + " ");

        }
    }
}
