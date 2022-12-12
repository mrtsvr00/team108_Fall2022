package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {

        // java da bicok yapida get ve set methodlari bulunur.
        //get methodlari bilgiyi bize getririken
        //set methodlari bilgii update eder.

        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler);//[A, Z, T]

        //2. indexe F elemanini ekleyin
        //add method u var olan listeden herhangi bir elementi degistirmeden istedigimiz elemnti ekler,kalanlari kaydirir.

        harfler.add(2, "F");
        System.out.println(harfler);//[A, Z, F, T]

        harfler.set(2, "M");
        System.out.println(harfler);//[A, Z, M, T]

        // set methodu var olan elementin degerini gunceller.
        // eleman sayisini artirmaz.
    }
}
