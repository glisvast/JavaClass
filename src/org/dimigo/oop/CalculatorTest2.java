package org.dimigo.oop;

public class CalculatorTest2 {

    public static double PI = 3.14;

    public static void main(String[] args) {
        //System.out.println(cal);

        System.out.println(Calculator2.PI);

        Calculator2 c1 = new Calculator2();
        Calculator2 c2 = new Calculator2();
        Calculator2 c3 = new Calculator2();

        c1.PI = 3.14;

        System.out.println(c1.PI);
        System.out.println(c2.PI);
        System.out.println(c3.PI);

        //cal.powerOn();
        System.out.println(Calculator2.add(10, 20, c1));
        System.out.println(Calculator2.sub(10, 20, c1));
        System.out.println(Calculator2.mul(10, 20, c1));
        System.out.println(Calculator2.div(10, 20, c1));
        //cal.powerOff();
    }
}
