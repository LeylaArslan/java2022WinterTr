package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);//[Aykut, Yusuf, Ilker, Oguzhan]

        boolean sonuc = isimler.remove("Oguzhan");

        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");

        }

        System.out.println(isimler);//[Aykut, Yusuf, Ilker]


        sonuc = isimler.remove("Fikret");
        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");

        }
        System.out.println( isimler.remove(1));

    }
}