package com.hillel.zhuravytskii.homeworks.homework5a;

public class Circle implements Figure {
    private double radius ;
    private static final String NAME = " Circle";
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {
        double areaCircle= Math.PI * radius* radius;
        return areaCircle;

    }
    @Override
    public String getName(){
        return NAME;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
  }
