package com.hillel.zhuravytskii.homeworks.homework23.homework3;

public class RectangleAreaStrategy implements ShapeAreaStrategy{
    private double width;
    private double height;

    public RectangleAreaStrategy(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
}
