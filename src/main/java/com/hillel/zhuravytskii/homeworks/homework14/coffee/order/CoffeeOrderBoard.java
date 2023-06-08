package com.hillel.zhuravytskii.homeworks.homework14.coffee.order;

import java.util.PriorityQueue;

class CoffeeOrderBoard {
    private int nextOrderNumber;
    private PriorityQueue<Order> orders;

    public CoffeeOrderBoard() {
        nextOrderNumber = 1;
        orders = new PriorityQueue<>();
    }

    public void add(String orderName, String customerName) {
        Order order = new Order(nextOrderNumber, orderName, customerName);
        orders.add(order);
        nextOrderNumber++;
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            return null;
        }
        return orders.poll();
    }

    public Order deliver(int orderNumber) {
        Order targetOrder = null;
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                targetOrder = order;
                break;
            }
        }
        if (targetOrder != null) {
            orders.remove(targetOrder);
        }
        return targetOrder;
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getOrderName());
        }
    }
}