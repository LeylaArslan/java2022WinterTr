package day19_doWhileLoop;

public class C02_Work {
    public static void main(String[] args) {
          // soru 7
        // kullanicidan bir sayi alin ve bu sayinin rakamları toplamini yazdirin

        int input = 5555;
        int rakam = 0;
        int rakamlartoplamı = 0;

        while (input > 0){
        rakam = input % 10;
        rakamlartoplamı += rakam;
        input /= 10;
    }
        System.out.println(rakamlartoplamı);

    }

    }

