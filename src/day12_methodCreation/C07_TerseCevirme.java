package day12_methodCreation;

public class C07_TerseCevirme {
    public static void main(String[] args) {

        //  verilen bir String'i terse cevirip o halini bize donduren bir method olusturun
        String str="can";
        System.out.println(metniTerseCevir(str));
        System.out.println(metniTerseCevir("haydi eller havaya"));
        String sonuc=metniTerseCevir("hayat guzel");
        System.out.println(sonuc);//lezug tayah


    }

    public static String metniTerseCevir(String str){
        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);

        }
        return tersStr;

    }
}
