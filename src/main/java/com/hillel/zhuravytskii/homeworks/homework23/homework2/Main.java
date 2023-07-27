package com.hillel.zhuravytskii.homeworks.homework23.homework2;

public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector(new OrdinaryCarBuilder());
        director.constructCar();
        Car car = director.getCar();
        System.out.println("Звичайний автомобіль:");
        System.out.println(car);

        director = new CarDirector(new SportsCarBuilder());
        director.constructCar();
        car = director.getCar();
        System.out.println("\nСпортивний автомобіль:");
        System.out.println(car);
    }
}
