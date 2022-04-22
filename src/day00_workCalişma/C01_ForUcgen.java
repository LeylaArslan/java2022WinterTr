package day00_workCalişma;

public class C01_ForUcgen {

    public static void main(String[] args) {

        // asagidaki sekli olustur
        //           *
        //          * *
        //         * * *
        //        * * * *
        //       * * * * *
        //      * * * * * *
        //     * * * * * * *
        //    * * * * * * * *
        //   * * * * * * * * *
        //  * * * * * * * * * *
        // * * * * * * * * * * *

        int i, j, k, z;
        k=9;
        for (j = 0; j <=k; j++){

            for (i = 0; i<=k-j ; i++)
                System.out.print(" ");
            for (z = 0;  z<=j ; z++) {
                System.out.print("* ");
            }
            System.out.print("");
            System.out.println();
        }
    }

}
