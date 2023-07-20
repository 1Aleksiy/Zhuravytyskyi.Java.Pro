package com.hillel.zhuravytskii.homeworks.homework19;

public class Main { public static void main(String[] args) {
    try {
        TestRunner.start(MyTestClass.class);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
