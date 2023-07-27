package com.hillel.zhuravytskii.homeworks.homework23;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        Furniture bed = factory.createFurniture("bed");
        Furniture desk = factory.createFurniture("desk");
        Furniture sofa = factory.createFurniture("sofa");

        bed.create();
        desk.create();
        sofa.create();
    }
}
