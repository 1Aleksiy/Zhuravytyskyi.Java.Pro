package com.hillel.zhuravytskii.homeworks.homework17;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple(1.5F));
        appleBox1.addFruit(new Apple(5.1F));

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple(3.7F));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1.5F));
        orangeBox.addFruit(new Orange(6.2F));
        orangeBox.addFruit(new Orange(2.6F));

        System.out.println("Apple Box 1 weight: " + appleBox1.getWeight());
        System.out.println("Apple Box 2 weight: " + appleBox2.getWeight());
        System.out.println("Orange Box weight: " + orangeBox.getWeight());

        System.out.println("Are apple boxes equal in weight? " + appleBox1.compare(appleBox2));
        System.out.println("Are apple and orange boxes equal in weight? " + appleBox1.compare(orangeBox));

        appleBox1.merge(appleBox2);

        System.out.println("Apple Box 1 weight after merging: " + appleBox1.getWeight());
        System.out.println("Apple Box 2 weight after merging: " + appleBox2.getWeight());
    }}