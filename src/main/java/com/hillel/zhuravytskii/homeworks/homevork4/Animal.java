package com.hillel.zhuravytskii.homeworks.homevork4;
import java.util.HashMap;
import java.util.Map;

abstract class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected boolean canSwim;

    public static final Map<Class, Integer> animalCount = new HashMap();

    public Animal(String name, int maxRun, int maxSwim, boolean canSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.canSwim = canSwim;
    }

    protected void run(int distance) {
        if (maxRun < distance) {
            System.out.printf("%s can not run more than %s%n", name, maxRun);
            return;
        }

        System.out.printf("%s is running %s meters. %n", name, distance);
    }

    protected void swim(int distance) {
        if (maxSwim <= distance) {
            System.out.printf("%s can not swim more than %s%n", name, maxSwim);
            return;
        }

        System.out.printf("%s is swimming %s meters. %n", name, distance);
    }

    protected void increaseAnimalCount(Class cl) {
        Integer value = animalCount.getOrDefault(cl, 0);
        animalCount.put(cl, ++value);
    }

    public static void printAnimalCounts() {
        animalCount.forEach((key, value) -> System.out.printf("Class [%s] , count [%s]%n", key, value));
    }}