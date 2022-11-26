package day08_StringManipulation;

public class C05_charAt {
    public static void main(String[] args) {

        String str="Java guzeldir";//13 karakter

        // java da index 0 dan baslar
        // J==> 0.index , r==>12
        // charAt(index) index ile istedigimiz index deki char a ulasabiliriz

        //Ilk a yi yazdiralim
        System.out.println(str.charAt(1));

        //Sondan 2.harfi yazdiralim
        System.out.println(str.charAt(13-2));//karakter sayisi-2. indexteki eleman

        //Sondan 4.karakteri buyuk harf olarak yazdirin
        System.out.println(str.charAt(13-4));//

        //charAt() method u bize char dondurdugu icin toUppercase() calismaz
        //String methodlarini charAt() ile kullanmak isterseniz
        //charAt() den once kullanmalisiniz

        // System.out.println(str.charAt(13));//StringIndexOutOfBoundsException
        //Eger index olarak karakter sayisi daha buyuk bir deger girersek
        // o indexi bulamayacagi icin hata verir

    }
}
