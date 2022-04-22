package day12_stringManipulation;

public class C02_lastIndexof {

    public static void main(String[] args) {
        String cumle="Java ogren,yeni program ile birsayfa ac";
        String kelime="yeni";

                int ilkkullanim=cumle.indexOf(kelime);
                int sonkullanım=cumle.lastIndexOf(kelime);

                if (ilkkullanim==(-1)){

                    System.out.println("Girilen kelime cumlede kullanılmamis.");

                }else if (ilkkullanim==sonkullanım){
                    System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");

                }else {
                    System.out.println("Girilen kelime cumkede 1 den fazla kullanilmis.");
                }


               String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4));



    }
}
