package day10_switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();
        // bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok kalabalık ve anlasılması guc olabilir
        // bunun yerine switch - case yapısını kullanabiliriz

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kiş");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");


        }


    }
}

