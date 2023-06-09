package com.hillel.zhuravytskii.homeworks.homework5a;

public class Triangle implements Figure {
    private static final String NAME =" Triangle";
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    @Override
    public double getArea() {
        double p = (sideA+ sideB + sideC)/2;
        double areaTriangle = Math.sqrt(p *(p-sideA)*(p - sideB)*(p-sideC));
        return areaTriangle;
    }
    @Override
    public String getName(){
        return NAME;
    }
    public double getSideA(){
        return sideA;
    }
    public void setSideA(double sideA){
        this.sideA = sideA;
    }
    public double getSideB(){
        return sideB;
    }
    public void setSideB(double sideB){
        this.sideB = sideB;
    } public double getSideC(){
        return sideC;
    }
    public void setSideC(double sideC){
        this.sideC = sideC;
    }

}