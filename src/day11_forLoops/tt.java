package day11_forLoops;

public class tt {
    public static void main(String[] args) {
        /*
        input degerine kadar her satirda * sayisini bir artirip sonra azaltarak asagidaki sekli yazdirin

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

         */
        int input = 4;

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");



        }

        for (int i = 1; i <=3 ; i++) {
            for (int j = 3; j >=i ; j--) {
                System.out.print("* ");

            }
            System.out.println("");

        }


    }
}
