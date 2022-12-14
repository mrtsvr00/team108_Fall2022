package day19_arraylist_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {


        Integer [] arr={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer>list1=new ArrayList<>();

        //arraydeki tum elementleri list'e kopyalayalim

        for (Integer each:arr
             ) {
            list1.add(each);

        }
        System.out.println(list1);//[2, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]

        //Araydeki cift sayilari olusturacagimiz bir list e tasiyalim

        List<Integer>ciftSayilarList=new ArrayList<>();

        for (Integer each:arr
             ) {
            if (each%2==0){
                ciftSayilarList.add(each);
            }

        }
        System.out.println(ciftSayilarList);//[2, 4, 6, 4, 6, 8, 4]
    }
}
