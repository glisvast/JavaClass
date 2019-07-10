package org.dimigo.oop;

public class Calculator {

    // 인스턴스 필드
    private int num1;
    private int num2;
    private boolean powerFlag = false;



    public Calculator() {
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

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

    int add(int num1, int num2) {
        powerOn();
        return num1 + num2;
    }

    int sub(int num1, int num2) {
        powerOn();
        return num1 - num2;
    }

    int mul(int num1, int num2) {
        this.powerOn();
        return num1 * num2;
    }

    double div(int num1, int num2) {
        this.powerOn();
        return num1 / num2;
    }

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
}
