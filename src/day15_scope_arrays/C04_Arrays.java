package day15_scope_arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        int [] arr={1,2,3};// bu sekilde yazildiginda kac element yazildi ise onu lenght olarak kabul eder.
        int arr2[]={4,5,6,7,8,9};


        String [] harfler=new String[4000];

        System.out.println(arr.length);//3
        System.out.println(arr2.length);//6
        System.out.println(harfler.length);//4000

        //Stringde kullandigimiz harfler.lenght() bir method iken
        //array'deki lenght method degil variabledir. arr.lenght


    }
}
