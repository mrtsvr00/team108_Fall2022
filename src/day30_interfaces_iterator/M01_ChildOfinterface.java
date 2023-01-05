package day30_interfaces_iterator;

public class M01_ChildOfinterface implements I01_Interface,I02_Interface {

        // Bir class baska bir class'i extends keyword ile parent edinebilir
        // Ancak birden fazla class'i parent EDINEMEZ
        // Interface'ler icin boyle bir sinirlama yoktur
        // Bir class istedigi kadar Interface'i implement edebilir


    public static void main(String[] args) {


        System.out.println(I02_Interface.SAYI);
        // I01_Interface.SAYI=25;
        // Cannot assign a value to final variable 'SAYI'

        // Interface'de olusturulan static veya default olarak isaretlenen method'larin farki
        // static olana interfaceIsmi.staticMethodIsmi seklinde ulasabilirken
        // default olana child class'dan olusturulacak obje uzerinden ersilebilir.
        I01_Interface.method34();
        M01_ChildOfinterface obj = new M01_ChildOfinterface();
        obj.method44();
    }
    // Eger birden fazla interface implement edildiginde
    // Ayni isimde method'lar farkli interface'lerde varsa
    // return type'a bakilir.
    // return type ayni ise sorun olmaz, cunku ikisini de implement edebiliriz
    // ancak return type'lari farkli ise birini tercih ettigimizde digeri CTE verir
    // Bu durumda parent interface'lere mudahale etmek mumkunse mudahale edilebilir
    // veya bu interface'lerden birini implement etmekten vazgecebiliriz



    @Override
    public void method1() {

    }


    @Override
    public int method2() {
        return 0;
    }


    @Override
    public String method3() {
        return null;
    }


    @Override
    public void method4() {

    }


    @Override
    public void method5() {

    }


    @Override
    public int method6() {
        return 0;
    }
}
