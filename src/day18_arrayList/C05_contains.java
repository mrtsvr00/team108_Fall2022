package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_contains {
    public static void main(String[] args) {

        int []arr={4,3,6,7,5,3,6,5,5,2,5,2,5,3,5,8,5,5,9};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);//[4, 3, 6, 7, 5, 3, 6, 5, 5, 2, 5, 2, 5, 3, 5, 8, 5, 5, 9]

        System.out.println(sayilar.contains(3));//true
        System.out.println(sayilar.contains(8));//false

    }
}
