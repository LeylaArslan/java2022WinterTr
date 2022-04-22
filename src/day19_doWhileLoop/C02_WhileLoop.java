package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //soru 7
        // kullanicidan bir sayi alin ve bu sayinin rakamları toplamini yazdirin

        int input = 9876;
        int rakam=0;
        int rakamlartoplami=0;

        while(input>0){
            rakam=input%10;
            rakamlartoplami += rakam;
            input/=10;
        }
        System.out.println(rakamlartoplami);
    }


}
