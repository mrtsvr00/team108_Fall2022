package day16_arrays;

import java.util.Arrays;

public class C10_ArrayeBirElementBekleme {
    public static void main(String[] args) {

        // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        // eski array’e yeni degeri atayin.

        String[] isimler={"Ali","Veli","Cem"};
        String eklenecekIsim="Kemal";
        System.out.println(Arrays.toString(elementEkle(isimler, eklenecekIsim)));


    }
    public static String []elementEkle(String[]isimler,String eklenecekIsim){

        String [] temp= new String [isimler.length+1];

        for (int i = 0; i < isimler.length; i++) {
            temp[i]=isimler[i];

        }
        temp[temp.length-1]=eklenecekIsim;
        return temp;

    }

    }


