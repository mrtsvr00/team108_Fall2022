package day17_arrays;

import java.util.Arrays;

public class C04_MultidimensionalArrays {
    public static void main(String[] args) {

        int[][]arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//4

        System.out.println(arr[2][1]);

        System.out.println(arr[3]);//[I@7c75222b

        // Multi dimensinol Array ile calisirken dikkat etmemiz gereken en onemli konu ,
        // yazilan konu bir Array mi yazdirabilecegimiz bir element dondurdugudur

        System.out.println(Arrays.toString(arr[3]));//[2]

        //  21 nci satirdaki 2 elementini yazdirmak istersek
        System.out.println(arr[3][0]);//2

        // Multi dimensional array'in tumunu yazdirmak isterseniz
        // tek katli array'leri yazdirmak icin kullandigimiz yontem yeterli olmaz
        System.out.println(Arrays.toString(arr)); // [[I@48140564, [I@58ceff1, [I@7c30a502, [I@1d251891, [I@49e4cb85]
        System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]
    }
}
