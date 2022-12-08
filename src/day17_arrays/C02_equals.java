package day17_arrays;

import java.util.Arrays;

public class C02_equals {
    public static void main(String[] args) {

        int []arr1={3,8,0};
        int []arr2={8,3,0};

        System.out.println(Arrays.equals(arr1,arr2));//false

        // equqls methodu hem elementleri hemde indexleri kontrol eder
        // ayni indexlerde ayni elementler varsa true, yoksa false doner.

        // Eger siralamadan dolayi false donmesini istemiyorsak
        // once iki array ide sort yapabiliriz

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2));//true
    }
}
