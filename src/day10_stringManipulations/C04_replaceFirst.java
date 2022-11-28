package day10_stringManipulations;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str="Java heyecandir";

        //eger tum a lari degilde sadece ilk a yi degistirmek isteerseniz

        System.out.println(str.replaceFirst("a", "A"));//JAva heyecandir

        //ilk harf veya rakami yildiz yap

        System.out.println(str.replaceFirst("\\w", "*"));//*ava heyecandir
    }
}
