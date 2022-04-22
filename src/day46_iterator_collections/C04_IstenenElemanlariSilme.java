package day46_iterator_collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_IstenenElemanlariSilme {

    public static void main(String[] args) {
        /*
        Soru 3)

        Bir listedeki istenen sayi araliginda olmayan
        elementleri silen bir program yaziniz …
        (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
        Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        output: [23,40]
         */
        List<Integer> liste= new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);


        ListIterator itr =liste.listIterator();

        while (itr.hasNext()){
            Object sayi=itr.next();
            if ((Integer)sayi<20 || (Integer)sayi>40){
                itr.remove();
            }
        }
        System.out.println(liste);
    }
}
       /*
             SORU 5
        (iterator ve index kullanımına örnek )
        Bir listedeki ilk n elemani iterator kullanaral 5 arttırın.
        ornek: list:[2,13,56,23,45,14,40]
        arttırılması istenen eleman sayisi:3
        output:[7,18,61,23,45,14,40]

       import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_W {
    public static void main(String[] args) {
        List<Integer> liste= new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);


        ListIterator itr =liste.listIterator();

        while (itr.hasNext()){
            Object sayi=itr.next();
            if (itr.nextIndex()<4){
                itr.set((Integer)sayi +5);
            }
        }
        System.out.println(liste);
    }
}

        */