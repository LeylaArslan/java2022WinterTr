package day12_stringManipulation;

public class C01_indexof {

    public static void main(String[] args) {
        //last indexte 2.soru

        String cumle = "Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime = "og ";

        int ilkkullanim = cumle.indexOf(kelime);
        int ikinciKullanim=cumle.indexOf(kelime,ilkkullanim+1);

        if (ilkkullanim == (-1)) {
            System.out.println("Girilen kelime cumlede kullanılmamis.");
        }else if(ikinciKullanim==(-1)){
            System.out.println("Girilen kelime cümlede 1 kere kullanılmıs.");

        }else{
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmis.");
        }




    }
}