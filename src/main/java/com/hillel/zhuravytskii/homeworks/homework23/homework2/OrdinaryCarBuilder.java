package com.hillel.zhuravytskii.homeworks.homework23.homework2;

public class OrdinaryCarBuilder implements CarBuilder{
 private Car car;

    public OrdinaryCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildWheels() {
        car.setWheels("Звичайні колеса");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Звичайний двигун");
    }

    @Override
    public void buildDoors() {
        car.setDoors("Звичайні двері");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
class SportsCarBuilder implements CarBuilder {
    private Car car;

    public SportsCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildWheels() {
        car.setWheels("Спортивні колеса");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Спортивний двигун");
    }

    @Override
    public void buildDoors() {
        car.setDoors("Спортивні двері");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
