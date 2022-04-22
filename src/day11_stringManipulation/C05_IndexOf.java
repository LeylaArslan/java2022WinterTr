package day11_stringManipulation;

import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";
        str1.indexOf('J');

        System.out.println(str1.indexOf('J'));//0
        System.out.println(str1.indexOf("l"));//19

        System.out.println(str1.length()-1);//35
        System.out.println(str1.indexOf("aska"));//10

        System.out.println(str1.indexOf("b"));//5

        System.out.println(str1.indexOf('b', 5));


        int ilkindex=str1.indexOf('a');
        System.out.println(str1.indexOf('a',ilkindex+1));


        int ilkbindex=str1.indexOf("b");
        System.out.println(str1.indexOf("b",ilkbindex+1));

        System.out.println(str1.indexOf("guzel",20));

        System.out.println(str1.indexOf("y"));

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen mailinizi yazin");
        String mail= scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");

        }else{
            System.out.println("mailiniz kabul edildi");
        }



    }
}
