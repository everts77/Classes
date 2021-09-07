package com.company;

public class Vehicle {
    public static String type;
    public static String name;
    public static int age;
    public static int power;


    public Vehicle(String type, String name, int age, int power) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.power = power;
    }
    
    public static void display() {
        System.out.println();
        System.out.println("Type of vehicle: "+type+". Vehicle name: "+name+", Manufacture date: "+age+", Horse power: "+power+" h/p");
    }

}

