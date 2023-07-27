package com.hillel.zhuravytskii.homeworks.homework23.homework2;

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void constructCar() {
        carBuilder.buildWheels();
        carBuilder.buildEngine();
        carBuilder.buildDoors();
    }

    public Car getCar() {
        return carBuilder.getCar();
    }
}
