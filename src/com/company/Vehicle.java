package com.company;

public class Vehicle {
    private String color;
    private String make;
    private int speed;
    private boolean hasWheels;
    private boolean isAccelerating;
    private boolean isDecelerating;
    private boolean isStarting;


public Vehicle(){
    this.isAccelerating=false;
    this.isDecelerating=false;
    this.isStarting=false;
    this.hasWheels=false;
}
public Vehicle(String color,String make,boolean hasWheels,boolean isAccelerating,boolean isDecelerating,boolean isStarting){

    this.color=color;
    this.make=make;

}
public Vehicle(boolean isAccelerating,boolean isDecelerating,boolean isStarting, boolean hasWheels){
    this.isAccelerating = isAccelerating;
    this.isDecelerating=isDecelerating;
    this.isStarting=isStarting;
    this.hasWheels=false;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public String isAccelerating() {
        if (isAccelerating) {
            return "accelerating";
        } else {
            return "decelerating";
        }
    }

    public void setAccelerating(boolean accelerating) {
        isAccelerating = accelerating;
    }
    public String isDecelerating() {
        if (isDecelerating) {
            return "Decelerating";
        } else {
            return "accelerating";
        }
    }

    public void setDecelerating(boolean decelerating){
                isDecelerating = decelerating;
            }
    public boolean isStarting() {
        return isStarting;
    }

    public void setStarting(boolean starting) {
        isStarting = starting;
    }
}
