package day29_staticKeyword;

public class C01_Static {
    String okulIsmi="Yildiz koleji";
    static String okulTelefonu="3122563635";

    public static void staticMethod(){
        System.out.println("Static method calisti");
    }
    public void staticOlmayanMethod(){
        System.out.println("Static olmayan Method calisti");
    }
}
