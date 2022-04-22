package day18_nestedForLoop;

import java.util.Scanner;

public class C07_Work {
    public static void main(String[] args) {
        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin
        Scanner scanner = new Scanner(System.in);
        int sayiAdedi = 3;
        int sayi = 0;
        int toplam = 0;

        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.println("lutfen bir sayi giriniz :");
            sayi = scanner.nextInt();
            toplam += sayi;
        }
        System.out.println("girilen "+ sayiAdedi + " sayinin toplami : " + toplam);

        sayi=0;
        toplam=0;
        int sayac=1;
        while (sayac <= sayiAdedi){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scanner.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("girilen "+ sayiAdedi + " sayinin toplami : " + toplam);

    }

}
