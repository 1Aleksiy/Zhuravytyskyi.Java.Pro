package com.hillel.zhuravytskii.homeworks.homework5a;

import com.sun.source.doctree.SummaryTree;

import java.awt.*;

//0. Створити базовий інтерфейс для геометричної фігури, в якому є метод, який повертає площу фігури.
//
//        Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат.
//
//        Створити масив фігур, і написати метод який виведе сумарну площу всіх фігур у цьому масиві
public class Main {
    public static void main(String[] args) {
        Figure[] figures= { new Square(8,8),
                new Triangle(5, 8, 5),
                new Circle(10)};
        for (Figure fig : figures)
            System.out.println(fig.getName() + ": area = " + fig.getArea());

    }

}
