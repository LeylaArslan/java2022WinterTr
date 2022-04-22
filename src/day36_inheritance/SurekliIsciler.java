package day36_inheritance;

public class SurekliIsciler extends Isci{

    public static void main(String[] args) {
        SurekliIsciler surIc1=new SurekliIsciler();
        surIc1.persNo=5001;
        surIc1.isim="Cem";
        surIc1.soyisim="Akay";
        surIc1.statu="Isci";
        surIc1.saatUcreti=11;
        surIc1.maas= surIc1.maasHesapla();
        System.out.println(surIc1);
    }

    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", \n saatUcreti=" + saatUcreti +  // ters salaş ( \n ) atarsak alt alta yazdıdıırırz
                ", \n statu='" + statu + '\'' +   // ters salaş atarsak alt alta yazdıdıırırz
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
