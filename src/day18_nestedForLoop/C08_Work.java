package day18_nestedForLoop;

import java.util.Scanner;

public class C08_Work {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin
        Scanner scanner=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

/*
        for (int i =1; i<1000000 ; i++){
            System.out.println("lutfen bir sayi giriniz.bitirmek için 0 basin");
            sayi= scanner.nextInt();
            if(sayi==0){
                break;
            }else {
                toplam+=sayi;
            }
        }
        System.out.println("girilen sayilarin toplami:"+toplam);

    */
        System.out.println(toplam);
        sayi=1;
        toplam=0;
        while (sayi!=0){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scanner.nextInt();
            toplam+=sayi;

        }
        System.out.println(toplam);
    }
}
