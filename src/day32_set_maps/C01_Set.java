package day32_set_maps;

import java.util.*;

public class C01_Set {
    public static void main(String[] args) {
        //Collections, objelerden olusan bir toplulugu bir arada tutan yapilardir.
        //Data turu olarak obje secilirse icerisine her data turunden element konulabilir
        //ancak bu durumda elemntlere ulasmak onlari update etmek gibi islemler normalden daha zor olabilir.
        //hatta bazen mumkun olmayabilir.

        Set<Object> karisikSet=new HashSet<>();
        karisikSet.add(12);
        karisikSet.add("Java");
        karisikSet.add('S');
        karisikSet.add(false);

        int []arr=new int[3];
        arr[2]=23;
        karisikSet.add(arr);


        List<Object>karisikList=new ArrayList<>();
        karisikList.add("Hava");
        karisikList.add(44);

        karisikSet.add(karisikList);
        System.out.println(karisikList);//[Hava, 44]

        System.out.println(karisikSet);//[Java, [I@4c203ea1, S, false, 12, [Hava, 44]]

        System.out.println(karisikSet.contains(44));// false
        System.out.println(karisikSet.contains(12));// true
        System.out.println(karisikSet.contains(23));// false

        System.out.println(karisikSet.size());// 6

    }
}
