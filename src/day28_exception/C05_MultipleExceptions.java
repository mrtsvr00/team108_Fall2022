package day28_exception;

import java.util.Scanner;

public class C05_MultipleExceptions {

    public static void main(String[] args) {

        /*
        Eger birden fazla exception olusma ihtimali varsa
        bu exceptionlar biribirinden bagimsiz ise
        1-tek try istenen kadar catch yapabilirim
        2-ikisi icinde ic ice try catch yapabilirim
        3-iki exception i da kapsayan tek bir catch yapabilirim.
         */


        String str="java 'da cok fazla exception var";
        int[]arr={3,5,1,3,2,6,3,6,8,5,2};

        // kullanicidan bir tamsayi alin ve girilen ayiyi index olarak kullanip
        // str ve arr den o indexteki elemanlari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir index giriniz");
        int index=scan.nextInt();

        /* 1 . Cozum

        try {


            System.out.println("Arr deki istenen elemennt : " + arr[index]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("istenen index String'in sinirlari disinda'");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("istenen index Array'in sinirlari disinda'");
        }

         */

        // 2.cozum ic ice
        /*

        try {
            try {
                System.out.println("String deki istenen elemennt : " + str.substring(index, index + 1));
                System.out.println("istenen index Array'in sinirlari disinda'"+ arr[index]);
            } catch (Exception e) {
                System.out.println("istenen index String'in sinirlari disinda");
            }
        } catch (Exception e) {
            System.out.println("istenen index Array'in sinirlari disinda'");
        }
        */

        // 3. cozum tek ama daha kapsamli bir exception kullanma

        try {
            System.out.println("String deki istenen elemennt : " + str.substring(index, index + 1));
            System.out.println("istenen index Array'in sinirlari disinda : "+ arr[index]);
        } catch (RuntimeException e) {

            System.out.println("index String ve/veya Array'in sinirlari disinda");
            e.printStackTrace();
        }



    }
}
