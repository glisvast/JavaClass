package org.dimigo.basic;

public class subArray {

    public static void main(String[] args) {

        int[][] arr = new int [2][3];

        arr[0][2] = 1;
        arr[1][1] = 2;

        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println("");
        }

        /*
        for(int[] value: arr) {
            for(int value2 : value)
                System.out.println(value2);
        }
        */

        String[][] strArr = {
                new String[3],
                new String[2]
        };
    }
}
