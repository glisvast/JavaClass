package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        //1. if~else문
        //선겨권 연령: 만 19세
        int age = 17;

        //나이가 만 19세 이상이면 "투표하러 가세요" 출력
        //아니면 "선거권이 없네요" 출력
        if(age >= 19) System.out.println("투표하러 가세요");
        else System.out.println("선거권이 없네요");

        //2. switch문
        int num = new Random().nextInt(6) + 1;
        System.out.println(num);

        switch (num % 2) {
            case 0:
                System.out.println("짝수");
                break;
            case 1:
                System.out.println("홀수");
                break;
            default:
                System.out.println("???");
        }

        String menu = "치킨";
        switch (menu) {
            case "치킨":
                System.out.println("치킨 선택");
                break;
            default:
                System.out.println("아임 온 에이 다이어트");
                break;
        }
    }
}
