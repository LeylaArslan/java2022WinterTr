package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class C10_HsayiBulmacaWork {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random random=new Random();
        int sayi= random.nextInt(100);
        Scanner scanner=new Scanner(System.in);
        int tahmin=0;
        int sayac=0;
        System.out.println("lutfen bir sayi giriniz");

        while (sayi!=tahmin) {
            tahmin = scanner.nextInt();
            if (tahmin > sayi) {
                System.out.println("daha kucuk bir sayi soylemelisiniz");
            } else if (tahmin < sayi) {
                System.out.println("daha buyuk bir sayi soylemelisiniz");
            }
            sayac++;
        }
        System.out.println("tebrikler :"+(sayac-1)+"defada buldunuz");

    }
}
