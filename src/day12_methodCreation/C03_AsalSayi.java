package day12_methodCreation;

public class C03_AsalSayi {
    public static void main(String[] args) {


        //  verilen bir sayinin asal olup olmadigini true false olarak donduren method olusturun

        //  asalSayimi method'u boolean bir sonuc dondurdugunden
        //  bu method u calistirdigimizda
        //  ya direk yazdirmaliyiz

        System.out.println(asalSayimi(15));

        System.out.println(asalSayimi(88));

        //  ve method call'un getirecegi degeri sonucu atamak icin bir variable olusturabilirim

        boolean asalMiSonuc59=asalSayimi(59);
        System.out.println("59 icin sonuc : " + asalMiSonuc59); // true

    }
    public static boolean asalSayimi(int sayi){
        boolean asalSayimi=true;
        for (int i = 2; i < sayi ; i++) {
            if (sayi%i==0){
                asalSayimi=false;
                break;
            }

        }
        return asalSayimi;

    }
}
