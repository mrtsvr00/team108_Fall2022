package day31_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {
        // Verilen bir Arraydeki tekrar edilen elementleri sadece bi kere yazarak
        // array i kisaltan kod yazin

        int[]arr={1,2,2,3,5,6,1,2,3,4,5,6,1,2,3,5};

        Set<Integer> arrSet=new HashSet<>();

        //Arraydeki tum elementleri set e ekleyelim

        for (int each:arr
             ) {
            arrSet.add(each);

        }
        System.out.println(arrSet);//[1, 2, 3, 4, 5, 6]

        //Set deki element sayisina esit bir array olusturup
        //Set deki elementleri oraya tasiyalim

        arr=new int[arrSet.size()];

        int index=0;
        for (int each:arrSet
             ) {
            arr[index]=each;
            index++;

        }
        System.out.println("Array'in son hali : " + Arrays.toString(arr));//[1, 2, 3, 4, 5, 6]
    }
}
