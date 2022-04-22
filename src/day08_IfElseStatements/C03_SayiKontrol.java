package day08_IfElseStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {

        // soru6

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayi da pozitif oldugundan toplamları="+(sayi1+sayi2));

        }else if (sayi1<0 && sayi2<0){
            System.out.println("girdiginiz iki sayida negatif oldugundan carpımları="+(sayi1*sayi2));

        }else if (sayi1*sayi2<0){
            System.out.println("farklı isaretlerde sayilarla islem yapamazsın ");

        }else {
            System.out.println("sıfır carpmaya gore yutan elemandır");

        }



    }
}
