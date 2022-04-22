package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        // soru9

        String input="madam";
        palindromeKontrolEt(input);
    }
    private static void palindromeKontrolEt(String input) {

        String terstenInput="";
        for (int i = input.length()-1;i>=0 ; i--){
            terstenInput+=input.charAt(i);

        }
        System.out.println("Girdiginiz kelimenin tersten yazilişi :"+terstenInput);
        if ( input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiginiz keime palindrome");

        }else
            System.out.println("girdiniz kelime palindrome degil");


    }

}
