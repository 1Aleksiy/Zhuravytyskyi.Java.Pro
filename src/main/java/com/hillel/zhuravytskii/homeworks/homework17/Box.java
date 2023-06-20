package com.hillel.zhuravytskii.homeworks.homework17;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit>{
    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void addFruits(List<T> newFruits) {
        fruits.addAll(newFruits);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }

        float weight = 0.0f;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }

        return weight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void merge(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }

        if (!fruits.isEmpty() && !otherBox.fruits.isEmpty() && fruits.get(0).getClass() != otherBox.fruits.get(0).getClass()) {
            throw new IllegalArgumentException("Cannot merge boxes with different types of fruits.");
        }

        fruits.addAll(otherBox.fruits);
        otherBox.fruits.clear();
    }
}

