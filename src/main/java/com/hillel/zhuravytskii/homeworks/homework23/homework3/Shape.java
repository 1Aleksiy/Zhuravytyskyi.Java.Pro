package com.hillel.zhuravytskii.homeworks.homework23.homework3;

public class Shape {

    private ShapeAreaStrategy areaStrategy;

    public void setAreaStrategy(ShapeAreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }

    public double calculateArea() {
        return areaStrategy.calculateArea();
    }
}
