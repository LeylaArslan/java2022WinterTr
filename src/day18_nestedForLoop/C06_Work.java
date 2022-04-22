package day18_nestedForLoop;

public class C06_Work {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alip
        //bu sayiları ve aralarindaki tum sayıları yazdıran bir kod olustur

        int baslangic=10;
        int bitis=20;
        for (int i= baslangic;i<=bitis;i++){
            System.out.print(i+ " ");
    }
        System.out.println(" ");
        int i=baslangic;
        while (i<=bitis){
            System.out.print(i+" ");
            i++;
        }
        System.out.println(" ");
        System.out.println(baslangic);
}
}