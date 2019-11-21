package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setSize(35);
        car1.setColor("Orange");
        car1.setCapacity(120);
        car1.setSpeed(90);
        car1.setAccelerating(true);
        car1.setDecelerating(true);
        car1.setMake("Toyota");
        car1.setHasWheels(true);

        System.out.println(car1.toString());

        /*System.out.println("The size of the car is :" + car1.getSize());
        System.out.println("The color of the car is :" + car1.getColor());
        System.out.println("The carrying capacity of the car is :" + car1.getCapacity());
        System.out.println("The  speed of the car is :" + car1.getSpeed());
        System.out.println("The car is :" + car1.isAccelerating());
        System.out.println("The car is :" + car1.isDecelerating());
        System.out.println("The make of the car is :" + car1.getMake());
        System.out.println("The car has 4 wheels :" + car1.isHasWheels());
         */
    }
}
