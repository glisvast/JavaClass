package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator(10, 20);
        System.out.println(cal);

        //cal.powerOn();
        System.out.println(cal.getNum1() + " + " + cal.getNum2() + " = " + cal.add());
        System.out.println(cal.getNum1() + " - " + cal.getNum2() + " = " + cal.sub());
        System.out.println(cal.getNum1() + " * " + cal.getNum2() + " = " + cal.mul());
        System.out.println(cal.getNum1() + " / " + cal.getNum2() + " = " + cal.div());
        cal.powerOff();

        //cal.powerOn();
        System.out.println(cal.getNum1() + " + " + cal.getNum2() + " = " + cal.add(10, 20));
        System.out.println(cal.getNum1() + " - " + cal.getNum2() + " = " + cal.sub(10, 20));
        System.out.println(cal.getNum1() + " * " + cal.getNum2() + " = " + cal.mul(10, 20));
        System.out.println(cal.getNum1() + " / " + cal.getNum2() + " = " + cal.div(10, 20));
        cal.powerOff();
    }
}
