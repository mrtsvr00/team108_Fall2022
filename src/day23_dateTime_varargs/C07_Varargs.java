package day23_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        // Kac tane String argument yazilirsa yazlsin
        // Argumentleein en uzun olanini yazdiran bir method olusturun
        // Not en uzun kelime olarak birden fazla kelime varsa, ilkini yazdirin

        enUzunuyazdir("Ilyas","Berivan","Murat");
    }

    private static void enUzunuyazdir(String...kelimeler) {

        String enUzunKelime=kelimeler[0];

        for (String eachKelime:kelimeler
             ) {
            if (eachKelime.length()>=enUzunKelime.length()){
                enUzunKelime=eachKelime;

        }



        }

        System.out.println(enUzunKelime);

        }

    }

