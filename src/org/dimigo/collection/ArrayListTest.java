package org.dimigo.collection;

import org.dimigo.inheritance.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // 1. List 계열: ArrayList
//        List list = new ArrayList();
//        list.add("나자바");
//        list.add(100);
//        list.add(new Dog("개"));
//
//        String str = list.get(0).toString();

        // 2. 제네릭
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");

        printlist(list);

        list.add(1, "포도");

        printlist(list);

        list.set(2, "바나나");

        printlist(list);

        System.out.println(list.get(list.size() - 1));

        list.remove(0);

        printlist(list);

        list.remove("딸기");

        printlist(list);

        list.clear();

        printlist(list);
    }

    private static void printlist(List<String> list) {
        for(String s : list) {
            System.out.print(s + " | ");
        }
        System.out.println("");
    }
}
