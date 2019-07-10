package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        for(int i=1; i<10; i++) {
            for (int j=1; j<10; j++) {
                System.out.printf("%d*%d=%2d ", i, j, i * j);
            }
            System.out.println("\n");
        }

        int[] arr = {1, 2, 3, 4, 5};
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("");

        for (int value:arr) {
            System.out.println(value);
        }

        System.out.println("");

        String[] BTS = {"슈가", "J-Hope", "남준"};
        for (String value:BTS) {
            System.out.println(value);
        }

        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. ITZY");
            System.out.println("2. BIGBANG");
            System.out.println("3. Girls Day");
            System.out.println("4. Girls Generation");
            System.out.println("9. Exit");
            System.out.print("Select Menu => ");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("ITZY 선택함");
                    break;
                case 2:
                    System.out.println("BIGBANG 선택함");
                    break;
                case 9:
                    System.out.println("종료");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴");
            }
        } while(menu != 9);
    }
}
