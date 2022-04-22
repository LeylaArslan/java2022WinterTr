package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm);//22:13:20.831786900

        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i <100000 ; i++){
            sayi+=i;
        }
        //System.out.println(tm);//22:13:20.831786900
        LocalTime tmLoopSonrasi=LocalTime.now();//22:16:45.582432500
        System.out.println(tmLoopSonrasi);//22:16:45.582432500

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem " +(nano2-nano1) + " nanosaniyede bitti");//islem 2418600.0nanosaniyede bitti

        // ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));//15:01:08.242582100

        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz

    }

    }

