package com.hillel.zhuravytskii.homeworks.homework23.homework3;

public class Main { public static void main(String[] args) {

    Shape rectangle = new Shape();
    rectangle.setAreaStrategy(new RectangleAreaStrategy(5.0, 7.0));
    System.out.println("Площа прямокутника: " + rectangle.calculateArea());

    Shape triangle = new Shape();
    triangle.setAreaStrategy(new TriangleAreaStrategy(2.0, 5.0));
    System.out.println("Площа трикутника: " + triangle.calculateArea());
}
}
