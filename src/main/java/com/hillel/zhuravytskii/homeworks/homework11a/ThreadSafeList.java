package com.hillel.zhuravytskii.homeworks.homework11a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadSafeList<T> {
    private List<T> list;

    public ThreadSafeList() {
        list = Collections.synchronizedList(new ArrayList<T>());
    }

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public T get(int index) {
        return list.get(index);
    }



    public static void main(String[] args) {
        ThreadSafeList<String> list = new ThreadSafeList<>();
        list.add("Елемент 1");
        list.add("Елемент 2");
        list.add("Елемент 3");
        list.remove("Елемент 2");
        String element = list.get(0);
        System.out.println("Отриманий елемент: " + element);
    }
}