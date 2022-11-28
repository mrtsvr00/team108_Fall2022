package day10_stringManipulations;

public class C11_ForLoop {
    public static void main(String[] args) {

        // verilen bir sayinin faktoriyelini hesaplayin

        int input=13;
        int faktoriyel=1;

        for (int i = 13; i >=1 ; i--) {
            faktoriyel*=i;


        }
        System.out.println("verilen " + input + " sayisinin faktoriyeli : " + faktoriyel);
    }
}
