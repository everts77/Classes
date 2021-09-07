package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle Volvo = new Vehicle("Crossover", "Volvo XC60", 2021, 190);
        Vehicle.display();
        Bus Mercedes_Benz = new Bus("Bus", "Mercedes-Benz", 2020, 245, 150);
        Bus.display();
        Truck Scania = new Truck("Truck", "Scania", 2010, 300, 600);
        Truck.display();

    }
}
