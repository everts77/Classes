package com.company;

public class Truck extends Vehicle {
    private static int load_capacity;

    

    public Truck (String type, String name, int age, int power, int load_capacity) {
        super(type, name, age, power);
        this.load_capacity = load_capacity;
    }
    public static void display() {
        System.out.println("Type of vehicle: "+type+". Vehicle name: "+name+", Manufacture date: "+age+", Horse power: "+power+" h/p. Load capacity: "+load_capacity+" tons");
    }
}


