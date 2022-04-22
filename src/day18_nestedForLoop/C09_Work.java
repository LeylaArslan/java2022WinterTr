package day18_nestedForLoop;

import java.util.Scanner;

public class C09_Work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        while (toplam < 500) {
            System.out.println("lutfen bır sayi giriniz");
            sayi = scanner.nextInt();
            toplam += sayi;
        }
        System.out.println("artik yeter cok sayi girdin :"+toplam);
    }
    }


