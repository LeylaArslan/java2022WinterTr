package day31_immutableClasses;

public class C02_Eguals {
    public static void main(String[] args) {
        String a ="";
        a +=2;
        a +='c';
        a +=false;

        if (a == "2cfalse"){  //ilkel hal olmadıgı icin birsey yazdırmadı,yukardaki degerlerle olusturdu
            System.out.println("==");
        }
        if (a.equals("2cfalse")){
            System.out.println("equals");//equals
        }

        String b="2cfalse";
        if (b == "2cfalse"){  //ilkel hal oldugu icin yazdırdı java havuzuna bakar alir
            System.out.println("==");// ==
        }
        if (b.equals("2cfalse")){  //ilkel hal oldugu icin yazdırdı java havuzuna bakar alir
            System.out.println("eguals");//equals
        }
    }
}
