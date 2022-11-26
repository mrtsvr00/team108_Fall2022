package day09_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {


        String str="Java ogren,mutlu ol";

        //str mutlu iceriyormu ?
        System.out.println(str.contains("mutlu"));//true

        //charsequence : char dizisi

        System.out.println(str.contains("j"));//false
        System.out.println(str.contains(" "));//true

        // contains method u kactane olduguna degil;
        // sadece var olup olmadigina bakar

        System.out.println(str.contains("java") && str.contains("mutlu"));//true


    }
}
