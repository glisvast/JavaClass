package org.dimigo.basic;

import org.dimigo.oop.Book;

public class ArrayBasic {

    public static void main(String[] args) {
        int[] intArr = null;
        intArr = new int[5];

        int[] intArr2 = {1,2,3,4,5};
        printArray(intArr2);
        printArray(intArr);

        System.out.println("");

        double[] doubleArr = new double[5];

        printDouble(doubleArr);

        System.out.println("");

        String[] strArr = new String[3];
        strArr[0] = "조성진";
        printArray(strArr);

        System.out.println("");

        Book[] book = new Book[2];
        book[0] = new Book("제목", "나", 200);
        book[1] = new Book("제목", "나", 200);
        printArray(book);

        Book[] bookArr2 = /*new Book[]*/ {
                new Book("제목", "나", 200),
                new Book("제목", "나", 200)
        };

        printArray(bookArr2);

        //배열 사용시 주의사항
        int [] intArr3 = new int[3];
        System.out.println(intArr3[intArr3.length-1]);

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]);
        //System.out.println(strArr3[0].length());

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0]);
        System.out.println(bookArr3[0].getTitle());
    }

    private static void printArray(String[] strArr) {
        for(String value : strArr)
            System.out.print(value + " | ");
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr)
            System.out.print(value + " | ");
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr)
            System.out.println(value);
    }


    private static void printDouble(double[] intArr) {
        for(double value : intArr)
            System.out.print(value + " | ");
    }
}
