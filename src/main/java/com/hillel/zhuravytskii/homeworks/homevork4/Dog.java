package com.hillel.zhuravytskii.homeworks.homevork4;

public class Dog extends Animal {
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim, true);
        this.increaseAnimalCount(this.getClass());
    }
}