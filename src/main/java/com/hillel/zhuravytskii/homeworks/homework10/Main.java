package com.hillel.zhuravytskii.homeworks.homework10;


public class Main {
    public static void main(String[] args) {
        ValueCalculator calculator = new ValueCalculator();
//        calculator.setSize(1000000);
        calculator.calculateValues();


        float[] array = calculator.getArray();
        // Виведення результату
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
