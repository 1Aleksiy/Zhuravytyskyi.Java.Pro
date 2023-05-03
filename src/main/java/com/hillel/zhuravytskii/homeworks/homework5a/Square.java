package com.hillel.zhuravytskii.homeworks.homework5a;

public class Square implements Figure{
    private static final String NAME ="Square";
     double width;
     double height;
    public Square(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        double areaSquare = width * height;
        return areaSquare;

    }
    @Override
    public String getName(){
        return NAME;
    }


}
