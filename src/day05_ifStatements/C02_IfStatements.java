package day05_ifStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*Basit if cumleleri kodun geri kalanindan bagimsizdir
        sadece 1 sarta odaklanir
        o sart true ise if body calisir
        sart false ise if body calismaz( KOD CALISIR)
        birden fazla bagimsiz if cumlesi kullanilmissa
        her cumle birbirinden bagimsiz olacagindan
        bazi degerler icin tum if body'leri calisirken
        bazi degerler icin hic bir if body'si CALISMAYABILIR*/

        // Kullanicidan bir sayi alip
        //pozitif sayi ise pozitif,
        //100 ile 999 arasinda ise (sinirlar dahil) "pozitif 3 basamakli sayi"
        //3 ile bolunebiliyorsa "3 un kati"
        //birler basamagi 7 ise "Mukemmel"
        // seceneklerinden uygun olanlari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        if (sayi>0)
            System.out.println("Pozitif");

        if (sayi>=100 && sayi<=999)
            System.out.println("pozitif 3 basamakli sayi");

        if (sayi%3==0)
            System.out.println("3 un kati");

        if (sayi%10==7)
            System.out.println("Mukemmel");
    }
}
