package day18_nestedForLoop;
import java.util.Random;
import java.util.Scanner;

public class C10_HsayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd = new Random();
        int sayi = rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 1;

        System.out.println("lutfen bir sayı giriniz");
        while (sayi != tahmin) {
            tahmin = scan.nextInt();

            if (tahmin > sayi) {
                System.out.println("daha kucuk bir sayi soylemelisiniz");
            } else if (tahmin < sayi) {
                System.out.println("daha buyuk bir sayi soylemelisiniz");
            }
            sayac++;
        }
        System.out.println("tebrikler :" +(sayac-1)+"defada buldunuz");
    }
}