package com.hillel.zhuravytskii.homeworks.homework16;

public class Main {
    public static void main(String[] args) {
        SimpleTree tree = new SimpleTree();

        tree.add(8);
        tree.add(3);
        tree.add(10);
        tree.add(1);
        tree.add(6);
        tree.add(14);
        tree.add(4);
        tree.add(7);
        tree.add(13);

        tree.traverse();
    }
}