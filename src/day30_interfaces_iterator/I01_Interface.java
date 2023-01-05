package day30_interfaces_iterator;

public interface I01_Interface {
    // Interface'lerde tum method'lar public ve abstract'tir.
    // Interface'lerde tum variable'lar public,static ve final'dir.
    // final oldugundan sonradan deger atamak mumkun olmaz, olustururken deger ATANMALIDIR.
    int SAYI= 10;
    public static final String okulIsmi ="Yildiz Koleji";
    public int SAYI2= 20;
    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();
    void method5();

    /*
    Bir Interface a sonradan bir method eklemek istedigimizde o interface i daha once implement eden tum classlar
    yeni eklenene methodu implement etmek zorunda olur

    Java ya yapilan talepler sonucunda
    Java8 ile birlikte bu konuda bir istisna getirilmistir.
    Egersonradan eklenen methodun tum eski classslar tarafindan implement edilma mecburiyeti
    olmasin istiyorsaniz

    yeni olusturdugunuz methoda DEFAULT veya STATIC keyword ekleyipbody de olusturursaniz
    o zaman methodun child classlar tarafindan implement edilme MECBURIYETI olmaz.

     */

    public default void method44() {
        System.out.println("Interface'deki  default olarak isaretlenen method calisti");


    }
    public static void method34(){
        System.out.println("Interface'deki  static olarak isaretlenen method calisti");
    }
}
