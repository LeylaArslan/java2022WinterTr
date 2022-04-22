package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        // soru 6 while loop
        // Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

        // for loop ile de yapabiliriz ama biz
        // while loop ile yapalim
        int input=30;
         int bolen=1;
         int sayac=0;
         while (bolen<=input){
             if (input % bolen==0){
                 System.out.println(bolen+ " ");
                 sayac++;
             }
             bolen++;

         }
        System.out.println("");
        System.out.println(input + " sayisini bolen " + sayac + " adet sayi vardir");


    }
}
