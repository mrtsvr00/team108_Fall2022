package day11_forLoops;

public class C05_ForLoop {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        int basDeger=5;
        int bitDeger=10;

        if (bitDeger<basDeger){
            System.out.println("uyari");
        }else{
            int toplam=0;
            for (int i = basDeger; i <= bitDeger ; i++) {
                toplam += i;//
            }
            System.out.print(basDeger + " ile " + bitDeger + " arasindaki sayilarin toplami : " + toplam);



        }


    }
}
