package day19_doWhileLoop;

public class C02_Work {
    public static void main(String[] args) {
          // soru 7
        // kullanicidan bir sayi alin ve bu sayinin rakamlar─▒ toplamini yazdirin

        int input = 5555;
        int rakam = 0;
        int rakamlartoplam─▒ = 0;

        while (input > 0){
        rakam = input % 10;
        rakamlartoplam─▒ += rakam;
        input /= 10;
    }
        System.out.println(rakamlartoplam─▒);

    }

    }

