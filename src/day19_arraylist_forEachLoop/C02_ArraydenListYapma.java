package day19_arraylist_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydenListYapma {
    public static void main(String[] args) {

        Integer [] arr={2,3,4,6,3,4,6,1,8,5,4};

        /*
        Verilen bir Array'i List'e cevirmek icin 2 yontem vardir,
        1- Loop ile tum elementleri loop a kopyaladik
        2- asList () kullanmak
            cok tavsiye etmiyoruz, cunku 2 buyuk dezavantaji var
            -asList ile olusturulan List, array den donusturuldugu icin
            add,remove gibi size degistiren methodlar kullanilamaz
            -aslist ile olusturulan list ile bagli oldugu Array ortak birbirinden ayrilmiyor
            birinde yapacagimiz degisiklik otomatik olarak digerini etkiliyor
         */


        List<Integer>list1=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            list1.add(arr[i]);

        }
        System.out.println("loop ile tasinan list1 : " + list1);


        List<Integer> list2= Arrays.asList(arr);
        System.out.println("asList ile olusturulan list : " + list2);

        //list2.add(6);

        arr[0]=10;
        System.out.println(Arrays.toString(arr));//[10, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]

        System.out.println(list2);//[10, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]


    }
}
