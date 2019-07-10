package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src ={
                new String("서울"),
                "경기",
                "동탄",
                "부산"
        };

        System.out.println(Arrays.toString(src));

        String[] dest = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest));

        System.out.println(Arrays.equals(src, dest));

        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        System.out.println(Arrays.binarySearch(dest, "부산"));
    }
}
