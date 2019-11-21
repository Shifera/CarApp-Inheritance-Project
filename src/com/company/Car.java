package com.company;

public class Car extends Vehicle {
    private int size;
    private int capacity;


public Car()
{super();
}

public  Car(int size,int capacity,String color, String make,int speed, boolean hasWheels, boolean isAccelerating,boolean isDecelerating, boolean isStarting){
    super(isAccelerating,isDecelerating,isStarting, hasWheels);
    this.size=size;
    this.capacity=capacity;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setSpeed(){
        System.out.println();
    }

    @Override
    public String toString(){

        return this.size +" " + " "+ this.capacity +" " + super.isAccelerating() +" "+ this.isHasWheels() + " "+ super.isDecelerating() + " " + this.getSpeed() + " " + this.getColor() + " "+ this.getMake();

}
}


