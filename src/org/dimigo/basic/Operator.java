package org.dimigo.basic;

public class Operator {

    public static void main(String[] args) {

        //1. 산술연산자
        int a = 5, b = 2;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //2.5 ㄲ
        System.out.println((double)a/b);
        //System.out.println(a/0);


        //int보다 작은 타입간의 연산
        short s1 = 1, s2 = 2;
        short r4 = (short)(s1 + s2);
        int r5 = s1 + s2;


        boolean flag = true;
        a = 10;
        b = 0;

        if(flag || (a / b == 0)) {
            System.out.println("OR 연산");
        }

        if(!flag && (a / b==0)) {
            System.out.println("AND 연산");
        }


        String school = "디미고";
        int grade = 2;
        int ban = 4;
        String name = "김가은";

        System.out.println(grade + "" + ban + school + name);

    }

}
