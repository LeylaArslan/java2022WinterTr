package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alip
        //bu sayiları ve aralarindaki tum sayıları yazdıran bir kod olusturun

         int baslangic=40;
         int bitis=60;
         for (int i = baslangic; i <=bitis ;i++){
             System.out.print(i + " ");
         }
        System.out.println("");
         int i=baslangic;
         while (i<=bitis){
             System.out.print(i+ " ");
             i++;
         }
        System.out.println("");
        System.out.print(baslangic);


    }
}
