package org.dimigo.oop;

import java.util.Stack;

public class SnackTest {

    public static void main(String[] args) {

        int price = 0;

        Snack[] arr = {
                new Snack("새우깡", "농심", 1100, 2),
                new Snack("콘칲", "크라운", 1200, 1),
                new Snack("허니버터칩", "해태", 1500, 4)
        };

        for(Snack value : arr) {
            System.out.println(value.toString());
            price += value.calcPrice();
        }

        System.out.println("총 구매 금액 : " + String.format("%,d원", price));
    }
}
