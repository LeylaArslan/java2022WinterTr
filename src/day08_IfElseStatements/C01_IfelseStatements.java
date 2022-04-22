package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfelseStatements {
    public static void main(String[] args) {


        /* "Lutfen bir karakter giriniz"
        "Girdiginiz karakter bir harf"
        "Girdiginiz karakter harf degil")
       yazdirin
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')){

            System.out.println("Girdiginiz karakter bir harf");
        }else {
            System.out.println("Girdiginiz karakter harf degil");
        }

    }
}