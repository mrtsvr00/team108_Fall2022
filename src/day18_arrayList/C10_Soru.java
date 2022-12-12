package day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Soru {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");

        List<String> isimlerListesi=isimListesiOlustur();
        System.out.println(isimlerListesi);


    }
    public static List<String> isimListesiOlustur(){

        List<String> isimListesi=new ArrayList<>();
        String girilenIsim="";
        Scanner scan=new Scanner(System.in);

        while (!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("Listeye eklemek icin isim giriniz\nBitirmek icin q'ya basiniz.");
            girilenIsim=scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                isimListesi.add(girilenIsim);
            }

        }
        return isimListesi;


    }
}
