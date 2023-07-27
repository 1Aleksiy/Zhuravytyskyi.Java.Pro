package com.hillel.zhuravytskii.homeworks.homework23;

public class FurnitureFactory {
    public Furniture createFurniture(String type) {
        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "bed":
                return new Bed();
            case "desk":
                return new Desk();
            case "sofa":
                return new Sofa();
            default:
                return null;
        }
    }
}
