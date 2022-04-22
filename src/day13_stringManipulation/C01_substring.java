package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str = "Java ile IT cok guzel";
        System.out.println(str.substring(5));
        System.out.println(str.replace("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca" + str.substring(5));
        System.out.println(str.substring(9));


        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(0, 1));
        String harf = str.substring(5, 6);// bana 6.mcı harf 5inci indexsi ver demek
        System.out.println(harf);

        str = "Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7, 7));// 1.nci 7= 7.index dahil,2.nci 7 =7.index haric
        // enson sonuc hiclik olur bosluk gibi bisey
        //System.out.println(str.substring(5,2));hata verir 2<5
        System.out.println(str.substring(str.length() - 1));
        System.out.println(str.substring(str.length() - 5));
        System.out.println(str.substring(str.length()));


        /*
           //Java ogrenmek123 cok guzel@ cumlesini asagidaki stringe cevir
        // Java ogrenmek cok guzel
        String str = "Java ogrenmek123 cok guzel@";
        str = str.replace("123", "");
        str = str.replace("@", "");
        System.out.println(str);//Java ogrenmek cok guzel


         */
    }
    }

