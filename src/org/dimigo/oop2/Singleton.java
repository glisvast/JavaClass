package org.dimigo.oop2;

public class Singleton {

    private static Singleton instance = new Singleton();

    private static Singleton instance2;

    // new로 객체생성 불가
    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    // synchronized : 한번에 하나의 쓰레드만 사용하게 함
    public static synchronized Singleton getInstance2() {
        if(instance2 == null) {
            instance2 = new Singleton();
        }
        return instance2;
    }
}
