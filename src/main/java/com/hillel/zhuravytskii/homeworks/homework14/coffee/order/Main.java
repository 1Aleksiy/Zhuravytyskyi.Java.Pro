package com.hillel.zhuravytskii.homeworks.homework14.coffee.order;
public class Main {

        public static void main(String[] args) {
            CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

            orderBoard.add("Cappuccino", "John");
            orderBoard.add("Espresso", "Anna");
            orderBoard.add("Latte", "Peter");
            orderBoard.add("Mocha", "Emily");

            orderBoard.draw();

            Order nextOrder = orderBoard.deliver();
            System.out.println("Next order: " + nextOrder.getOrderName());

            Order specificOrder = orderBoard.deliver(2);
            System.out.println("Specific order: " + specificOrder.getOrderName());


            orderBoard.draw();

        }
    }
