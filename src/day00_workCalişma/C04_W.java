package day00_workCalişma;

import java.util.Scanner;

public class C04_W {


   /* Kullanıcıdan bir isim yazmasını isteyin,
   adın uzunluğu 3 olmalıdır.
   Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

    Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

    Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.
*/
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Lutfen isminizi giriniz");
      String isim= scan.nextLine();

      String result = (isim.length()==3 && isim.equalsIgnoreCase("can") )? "isim ayni karakterlere sahiptir" :
              ("Dizenin benzersiz karakterleri var" );
      System.out.println(result);


   }
}
