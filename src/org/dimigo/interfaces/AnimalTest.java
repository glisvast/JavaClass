package org.dimigo.interfaces;

import org.dimigo.interfaces.IAnimal;
import org.dimigo.interfaces.Cow;
import org.dimigo.interfaces.Duck;
import org.dimigo.interfaces.Pig;

public class AnimalTest {

    public static void main(String[] args) {

        IAnimal.welcome();

        IAnimal[] animals = {
                new Duck(),
                new Cow(),
                new Pig(),
        };

        System.out.println("=== 평온한 동물농장 ===");

        for(IAnimal a : animals) {
            a.eat();
        }

        System.out.println("=== 늑대가 나타났다 ===");

        for(IAnimal a : animals) {
            a.bark();
        }
    }
}
