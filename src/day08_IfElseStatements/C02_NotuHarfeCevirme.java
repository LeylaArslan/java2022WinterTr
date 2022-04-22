package day08_IfElseStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
         // soru7
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double notSayi= scan.nextDouble();
        if (notSayi<0 || notSayi>100) {
            System.out.println("Lutfen gecerli bir not giriniz");

           }else if (notSayi<50){
            System.out.println("notunuz D");
           }else if (notSayi<60){
            System.out.println("notunuz C");
           }else if (notSayi<80){
            System.out.println("Notunuz B");
           }else {
            System.out.println("Notunuz A");
        }


    }
}
