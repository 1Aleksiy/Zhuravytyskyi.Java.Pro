package com.hillel.zhuravytskii.homeworks.homevork4;

import java.util.List;



public class Main {

    public static void main(String[] args) {
        List.of(
                        new Cat("Kira", 155, 0),
                        new Cat("Nol", 100, 2),
                        new Dog("Torri", 225, 8),
                        new Dog("Nora", 199, 12))
                .forEach(animal -> {
                    animal.run(200);
                    animal.swim(10);
                });
        Animal.printAnimalCounts();
    }
}
