package org.dimigo.oop;

public class Calculator2 {

    public static double PI = 3.141592;
    private boolean powerFlag;


    // 인스턴스 메소드
    public void powerOn() {
        if(this.powerFlag == false) {
            this.powerFlag = true;
            System.out.println("전원이 켜졌습니다.");
        }
    }

    public void powerOff() {
        if (this.powerFlag == true) {
            this.powerFlag = false;
            System.out.println("전원이 꺼졌습니다.");
        }
    }



    static int add(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 + num2;
    }

    static int sub(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 - num2;
    }

    static int mul(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 * num2;
    }

    static double div(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return (double)num1 / num2;
    }

    /*
    int add() {
        System.out.println(this);
        powerOn();
        return this.num1 + this.num2;
    }

    int sub() {
        powerOn();
        return this.num1 - this.num2;
    }

    int mul() {
        powerOn();
        return this.num1 * this.num2;
    }

    double div() {
        powerOn();
        return (double)this.num1 / this.num2;
    }
    */

}
