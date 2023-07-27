package com.hillel.zhuravytskii.homeworks.homework23.homework2;

public class Car {
    private String wheels;
    private String engine;
    private String doors;

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels='" + wheels + '\'' +
                ", engine='" + engine + '\'' +
                ", doors='" + doors + '\'' +
                '}';
    }
}
