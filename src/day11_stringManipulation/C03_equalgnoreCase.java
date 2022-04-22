package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalgnoreCase {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz? ?\nEvet veya Hayir");
       String cevap= scan.next();

       if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız :" + cevap + "derse katiliminiz onaylanmistir ");

        }else if (cevap.equalsIgnoreCase("hayir")){
           System.out.println("cevabiniz : " + cevap + "Sonraki derslerimize bekleriz");
       }else {
           System.out.println("lutfen evet veya hayir yaziniz");
       }


    }
}
