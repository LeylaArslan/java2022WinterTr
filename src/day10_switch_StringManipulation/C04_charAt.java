package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        String str="Java Cok Guzel";

        // J yı yazdıralım
        System.out.println(str.charAt(0));

        // G yazdıralım
        System.out.println(str.charAt(9));

        //va yaz
        System.out.println(""+str.charAt(2)+str.charAt(3));

        //cOK yaz
        System.out.println(str.toLowerCase().charAt(5)+
                           ""+str.toUpperCase().charAt(6)+
                             str.toUpperCase().charAt(7));
        // son karakteri yaz
        //string de 14 harf var ,son harfin indexi 14-1
        System.out.println(str.charAt(14-1));//uzunluk -1

        //eger uzunlugu indexs olarak girersek
        // java calistiktan sonra hata verir
        System.out.println(str.charAt(14));// 13 ncu harf sondu 14 te hata verirdi








    }

}
