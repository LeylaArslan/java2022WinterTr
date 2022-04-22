package day14_stringManipulation;

public class C02_TerstenYazdırma {
    public static void main(String[] args) {
        //soru5
        String input="Mavi";

        String tersStr=input.substring(3) +
                input.substring(2,3).toUpperCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();

        System.out.println(tersStr);




    }
}
