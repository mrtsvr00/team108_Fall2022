package day29_final_abstractClasses;

public abstract class DParent {

    /* Child classlarda tamaminda method1 ve method 2'nin MUTKAKA OLMASINI istiuoruz.

     Java parent classdaki istenen methodlari child classlarin override etmek
     ZORUNDA KALMASI icin abstract classini olusturmustur


     Bir class i Abstract yapmak istersek class deklarasyonuna abstract yazmamiz yeterlidir

     Bir abstract class'in icinde child class larin override etmesi
     MECBURI olan methodlar olabilecegi gibi MECBURI olmayan methodlarda olabilir.

     Child classlarin mutlaka override edecegi methodlari abstract yapariz

     abstract yapilan tum methodlar child classlarin tamaminda override edileceginden
     parent classdaki method un bodysine ihtiyac olmaz.
     Java da abstract methodlarin bodysi olmasina izin vermez

     Abstract clsasss larda abstract methodlar bulundugu icin
     Abstract classlardan obje uretilemez.

     */

    public abstract void method1();

    public abstract void method2();

    public void method3(){
        System.out.println("Parent class'daki method 3 calisti");

    }
}
