package day29_final_abstractClasses;

public class FChild extends DParent {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    //public abstract void method5();/ Abstract method in non-abstract class

    /*
    Bugune kadar olusturdugumuz standart classlari abstraction ile tanimlamak istedigimizde
    abstract olmayan class demek yerine CONCRETE Class diyoruz.

    Eger concrete bir class abstract bir classi parent edinirse
    Java class deklarasyonunun altini cizip
    parent abstract class(lar)daki abstract methodlari
    kendisine ImPLEMENT uyarlama yapmasini ister
     */
}
