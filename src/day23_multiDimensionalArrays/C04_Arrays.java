package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac elementli bir array istediginizi yazin");

        int uzunluk= scan.nextInt();

        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("array icin"+ (i+1) + ". elemani giriniz");
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}