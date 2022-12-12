package day18_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Soru {
    public static void main(String[] args) {

        // Verilen bir Arraydeki tekrar eden elementleri silip
        // Arrayi uniqe degerlerden olusan bir array haline getirin.

        int []arr={4,3,6,7,5,3,6,5,5,2,5,2,5,3,5,8,5,5,9};

        List<Integer> tekrarsizListe=new ArrayList<>();

        //arraydeki tum elementleri alip
        //listede varmi diye kontrl edelim
        //ve olmayanlari ekleyelim

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
            }

        }
        System.out.println(tekrarsizListe);


        // soruda bu degerleri arr ye atamamiz gerekiyor.

        arr=new int[tekrarsizListe.size()];

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=tekrarsizListe.get(i);

            }

        System.out.println("Array'in son hali : " + Arrays.toString(arr));

    }
}

