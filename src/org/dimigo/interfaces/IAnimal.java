package org.dimigo.interfaces;

// 인터페이스 : 하나의 표준, 규약, 명세
public interface IAnimal {

    //public static final String FARM_NAME = "디미 동물농장"; // 아래 거와 같음
    String FARM_NAME = "디미 동물농장2";

    // 추상 메소드 선언
    //public abstract void eat();
    void bark(); // public abstract 자동 붙임

    default void eat() {
        System.out.println("냠냠");
    }

    public static void welcome() {
        System.out.println(FARM_NAME + "에 오신걸 환영합니다!");
    }
}
