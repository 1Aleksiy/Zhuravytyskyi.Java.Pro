package com.hillel.zhuravytskii.homeworks.homevork4;
public class Cat extends Animal {
    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim, false);
        this.increaseAnimalCount(this.getClass());
    }
}