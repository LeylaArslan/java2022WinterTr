package day19_doWhileLoop;

import java.util.Scanner;

public class C04_Work {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi=1;
        int toplam=0;
        int sayacPozitif=0;
        int sayacNegatif=0;
        do {
            System.out.println("lutfen pozitif bir tam sayi girin \nbitirmek icin 0'a basin");
       sayi= scanner.nextInt();
       if (sayi<0){
           System.out.println("Negatif sayi giremezsiniz");
           sayacNegatif++;

       }else if (sayi>0){
                toplam += sayi;
                sayacPozitif++;
            }

        }while (sayi!=0);
        System.out.println("yanlislikla girilen negatif sayi adedi : " + sayacNegatif);
        System.out.println("girilen pozitif sayi adedi : " +sayacPozitif);
        System.out.println("girilen pozitif sayilarin toplami :" + toplam);
    }
}
