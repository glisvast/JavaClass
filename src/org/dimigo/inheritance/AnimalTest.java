package org.dimigo.inheritance;

public class AnimalTest {

    public static void main(String[] args) {
        Animal[] a = {
                new Animal("동물"),
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("어흥이")
        };

        for (Animal animal : a) {
            doAction(animal);
        }// Animal의 bark()

        Animal dog = new Dog("멍멍이");
        dog.eat();
        dog.sleep();
        Dog dog2 = (Dog) dog;
        dog2.wag();

        ((Dog) dog).wag();

        Animal cat = new Cat("야옹이");
        ((Cat) cat).scratch();

        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Cat);
        System.out.println(cat instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof Object);

        doAction(dog);
        doAction(cat);
    }

    private static void doAction(Animal a) {
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.scratch();
        } else if(a instanceof Dog) {
            ((Dog) a).wag();
        }
    }

}