package com.hillel.zhuravytskii.homeworks.homwork6;

public class HomeWorkApp {
    public static void printThreeWords() {
        System.out.println("Orange "+'\n' + "Banana "+'\n' + "Apple");


    }


    public static void checkSumSign(){
         int a = 5;
        int b = -10;
         if (a+b>=0){
             System.out.println("Сума позитивна");
         }
         else if (a+b<0){
            System.out.println("Сума негативна");
        }

    }

    public static void  printColor(){
        int value = 125;
        if (value<=0){
            System.out.println("Червоний");
        }
        else if (value<=100){
            System.out.println("Жовтий");
        }
        else if (value>100){
            System.out.println("Зелений");
        }


    }
    public static void compareNumbers(){
        int a =6;
        int b =38;
        if (a >= b){
            System.out.println("a >= b");
        }
        else if (a < b){
            System.out.println("a < b");
        }

    }
    public static void sumNumber(){
        int a = 15;
        int b = -10;
        int s = a +b;

        if (s>=10){
            if (s<=20)
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
    public static void positive(){
        int a = -5;
        if (a>=0){
            System.out.println("Позитивне");
        }
        else if (a<0){
            System.out.println("Негативне");
        }

    }
    public static void negative() {
        int a = 5;
        if (a >= 0) {
            System.out.println("False");
        } else if (a < 0) {
            System.out.println("True");
        }
    }
    public static void repeat(){
        String a= "Hello";
        int n =3;
        System.out.println(a.repeat(n));

    }
    public static void highYearDefinition(){
        int year = 2021;

        if (((year % 4 ==0) && (year % 100 != 0)) ||(year % 400 == 0)){
            System.out.println( year + " leap year");
        }
        else {
            System.out.println(year + " not a leap year");
        }
    }
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        sumNumber();
        positive();
        negative();
        repeat();
        highYearDefinition();


    }
}

