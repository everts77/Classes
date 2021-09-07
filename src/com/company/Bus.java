package com.company;

public class Bus extends Vehicle {
    public static int capacity;

    public Bus (String type, String name, int age, int power, int capacity) {
        super(type, name, age, power);
        this.capacity = capacity;
    }
    public static void display() {
        System.out.println("Type of vehicle: "+type+". Vehicle name: "+name+", Manufacture date: "+age+", Horse power: "+power+" h/p, Capacity: "+capacity+" persons.");
    }
}

