package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        // kullanıcadan 4 basmklı bir sayi isteyin
      Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli  pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<1000 || sayi>9999){
            System.out.println("Lutfen 4 basamakli sayi giriniz");


        }else  if (sayi%5==0){
            if (sayi%10==0){
                System.out.println("5'e bölünen cift sayı");
            }else {
                System.out.println("5'e bölünen tek sayi");
            }

        }else {
            System.out.println("Tekrar deneyin");

        }
    }
}
