package day21_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
        TANIMI
        1- Pass By value : programlama dilleri bir variable method’da kullanilacaksa, asil
        variable’in degerinin degisip degismeyecegine karar vermelidir. Eger method’da
        yapilan degisiklik asil variable’in degerini degistirmiyorsa buna pass by value,
        degistiriyorsa buna pass by reference denir.
         */


        /*Java PassByValue kullanir
        Yani method'lar arasinda gonderilen variable'larin
        kendileri degil, value'lari diger method'a yollanir.
         */
        int fiyat=100;
        // fiyat uzerinden %10 indirim yapip, indirimli fiyati donduren bir method olusturun
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(fiyat); // 100
        // eger indirimli fiyatin kalici olarak fiyatimizi degistirmesini istersek
        // atama yapariz
        fiyat=indirimYap10(fiyat);
    }
    public static int indirimYap10 (int fiyat){
        fiyat=fiyat*90/100;
        return fiyat;
    }
}
