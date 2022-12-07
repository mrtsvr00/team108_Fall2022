package day16_arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {


        // verilen bir Array i natural order a gore siralayip yazdirin.
        // binaryseach methodu binaryTree ozelligini kullandigindan
        // sirali olmayan arraylerde dogru sonuc dondurmeyebilir
        // oncesinde mutlaka sort () kullanilmalidir.

        String [] isimler= {"Huseyin", "Yusuf", "Mehmet", "Akile", "Said"};

        System.out.println(Arrays.binarySearch(isimler, 2));


        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));//[Akile, Huseyin, Mehmet, Said, Yusuf]
    }
}
