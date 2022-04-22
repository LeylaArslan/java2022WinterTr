package day14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        //soru7

        String isim = "leyla";
        String soyisim = "ARSLAN";
        String kKNo = "1234567890123456";

        String yeniIsim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");

        String yeniSoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");

        String yeniKKNo="**** **** ****"+kKNo.substring(12);
        System.out.println("isim-soyisim:" +yeniIsim+" "+yeniSoyisim+
                "\nkart no:" + yeniKKNo );
}
}
