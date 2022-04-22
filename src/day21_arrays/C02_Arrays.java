package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[]={"Fikret","Veli","Ayse"};
        System.out.println(arr1[0]);
        arr1[1]="Leyla";
        System.out.println(arr1[1]);
        int arr2[]=new int[4];
        System.out.println(arr2[1]);
        System.out.println(arr2[3]);
        System.out.println(arr2);
        for (int i = 0; i<4 ; i++) {
            System.out.println(arr2[i] + " ");
        }
        System.out.println("");

            System.out.println(Arrays.toString(arr2));

            arr2[1]=11;
            arr2[3]=22;

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));


        }
    }

