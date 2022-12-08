package day16_arrays;

import java.util.Arrays;

public class tt {
    public static void main(String[] args) {

        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]

        int []arr={4,5,6,7};
        System.out.println(Arrays.toString(sagaAtesle(arr)));

    }

        public static int[] sagaAtesle(int []arr){
        int temp=arr[arr.length-1];

            for (int i = arr.length-1; i >0 ; i--) {
                arr[i]=arr[i-1];

            }
            arr[0]=temp;


            return arr;
        }

    }
