package day18_arrayList;

import day16_arrays.C10_ArrayeBirElementBekleme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tt {
    public static void main(String[] args) {

        //  Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        //  kalan kismini list olarak bize donduren bir method olusturun

        List<String> isimler= C10_Soru.isimListesiOlustur();
        System.out.println(listeDondur(isimler));


    }
    public static List<String>listeDondur(List<String> isimler){

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen istemediginiz harfi giriniz");
        String istenmeyenHarf=scan.next().substring(0,1);

        List<String>yeniListe=new ArrayList<>();

        for (int i = 0; i < isimler.size() ; i++) {

            if (!isimler.get(i).contains(istenmeyenHarf)){
                yeniListe.add(isimler.get(i));

            }

        }


        return yeniListe;

    }
}
