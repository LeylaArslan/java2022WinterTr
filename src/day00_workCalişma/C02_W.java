package day00_workCalişma;

import java.util.Scanner;

public class C02_W {
    public static void main(String[] args) {

        //Verilen iki sayının (sıfırdan büyük veya sıfıra eşit)
        // toplamını hesaplayan ve yazdıran bir Java programı yazın.
        // verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

        /* Ornek:
        INPUT :
        25
        46
         OUTPUT :
        Numaralarin Toplami:71
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

       double sayi1 = scan.nextDouble();
       double sayi2 = scan.nextDouble();

         if (sayi1 >=999999999 || sayi2>=999999999 || sayi1+sayi2>999999999) {
             System.out.println("OverFlow");
         }

        else if (sayi1 >= 0 && sayi2 >= 0) {
            System.out.println("sayilarin toplamları=" + (sayi1 + sayi2));


        }

            }
        }