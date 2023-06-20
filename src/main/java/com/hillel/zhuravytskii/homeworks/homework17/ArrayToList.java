package com.hillel.zhuravytskii.homeworks.homework17;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();

        for (T element : array) {
            list.add(element);
        }

        return list;
    }

    public static void main(String[] args) {
        String[] array = {"Cat", "Dog", "Pig"};
        List<String> list = ArrayToList.toList(array);
        System.out.println(list);
    }
}
