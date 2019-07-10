package org.dimigo.oop2;

public class Person {
    private static final String TYPE = "포유류";
    private final String birthDate;
    private String name = "조성진";

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020101", "홍길동");
        Person p2 = new Person("20020201", "홍길순");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(Person.TYPE);


    }
}
