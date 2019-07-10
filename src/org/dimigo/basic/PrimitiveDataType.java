package org.dimigo.basic;

public class PrimitiveDataType {

    static boolean flag;

    public static void main(String[] args) {

        /*
        if (flag == true)
            System.out.println("참입니다!");
        else
            System.out.println("거짓입니다!");
        */

        System.out.println(flag ? "참입니다!" : "거짓입니다!");


        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" );
        System.out.println("뷁");

        String name = "조성진";
        System.out.println("My name is " + name);

        int index = 3;
        System.out.println("value of index = " + index);

        System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);

        long a = 10000000000L;

        float f1 = 3.14f;
        double d1 = 3.14;

        float f2 = 0.12345678901234567890f;
        double d2 = 0.12345678901234567890;

        System.out.println(f2);
        System.out.println(d2);

    }

}
