package org.dimigo.oop2;

public class Car {
    private static String company;
    private String name;

    // static block
    static{
        company = "기아";
        System.out.println("static block 호출");
    }

    public Car(String name){
        this.name = name;
        System.out.println("constructor 호출");
    }

    public static String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return company + " : " + name;
    }
}