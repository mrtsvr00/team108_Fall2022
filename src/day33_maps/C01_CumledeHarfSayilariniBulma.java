package day33_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_CumledeHarfSayilariniBulma {
    public static void main(String[] args) {
        //verilen cumlede kullanilan bir harfi
        //ve kacar kez kullanildigini yazdirin

        //ornek : Java candir
        //output : d=1 i=1 r=1 J=1 a=3 v=1 c=1 n=1

        String cumle="Java candir";

        // oncelikle boslugu ve noktalama isaretlerini yok edelim
        cumle=cumle.replaceAll("\\W","");

        String []cumleArr=cumle.split("");//[J, a, v, a, c, a, n, d, i, r]

        Map<String,Integer> kullanimSayilariMap=new TreeMap<>();

        for (int i = 0; i < cumleArr.length; i++) {
            //herbir elementi ele alip
            //map te key olarak yoksa value=1 olarak ekleriz
            //map te key olarak varsa value bir artirilmali

            if (!kullanimSayilariMap.containsKey(cumleArr[i])){
                kullanimSayilariMap.put(cumleArr[i],1);
            }else{

                int eskiValue= kullanimSayilariMap.get(cumleArr[i]);
                kullanimSayilariMap.put(cumleArr[i],eskiValue+1);
            }

        }
        System.out.println(kullanimSayilariMap);
    }
}
