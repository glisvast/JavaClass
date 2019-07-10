package org.dimigo.oop2;

public class SingletonTest {

    public static void main(String[] args) {

        //Singleton s = new Singleton();

        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

    }

}
