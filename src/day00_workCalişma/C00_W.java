package day00_workCalişma;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C00_W {


    public static void main(String[] args) {

        String dosyaYolu = "src/day41_exceptions/dosya";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }




    }
}
