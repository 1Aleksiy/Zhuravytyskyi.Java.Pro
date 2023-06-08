package com.hillel.zhuravytskii.homeworks.homework8;

import static com.hillel.zhuravytskii.homeworks.homework8.ArrayValueCalculator.doCalc;

public class Main {
    public static void main(String[] args) {

        try {
             int result = doCalc(new String[][]{{"1", "2", "3", "4"},{"5", "6", "7", "8" }, {"9", "10", "11", "12"} });
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException ex){
            System.out.println(ex.getMessage());}
        try {

            int result = doCalc(new String[][]{{"1", "2", "3", "a"},{"5", "6", "7", "8" }, {"9", "10", "11", "12"} , {"13", "14", "15", "16"} });
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException exception){
            System.out.println(exception.getMessage());}
        try {
            int result = doCalc(new String[][]{{"2", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}});
            System.out.println(" Sum array " + result);
        } catch (ArraySizeException | ArrayDataException exception){
            System.out.println(exception.getMessage());
        }

    }
}
