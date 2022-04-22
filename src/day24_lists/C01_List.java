package day24_lists;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        int arr[]={};

        C06_Arrays.arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr));


        List<Integer> sayilarList=new ArrayList<>();
        System.out.println(sayilarList);

        sayilarList.add(5);
        sayilarList.add(3);
        sayilarList.add(0,7);
        sayilarList.add(2,7);

        System.out.println(sayilarList);

    }
}
