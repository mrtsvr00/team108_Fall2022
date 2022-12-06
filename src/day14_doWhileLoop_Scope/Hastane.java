package day14_doWhileLoop_Scope;

public class Hastane {

    static String hastanesismi= "Yildiz Hastanesi";
    static String hastaneAdres ="Cankaya/Ankara";

    String personelIsmi;
    String personelAdresi;
    String personalTel;

    public static void main(String[] args) {

        Hastane p1 = new Hastane();
        p1.personelIsmi= "Kemal";
        p1.personelAdresi="";
        p1.personalTel="";


        Hastane p3 = new Hastane();
        p3.personalTel = "321323131";

    }
}
