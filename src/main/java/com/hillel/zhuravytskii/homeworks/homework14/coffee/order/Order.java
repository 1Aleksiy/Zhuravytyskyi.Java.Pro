package com.hillel.zhuravytskii.homeworks.homework14.coffee.order;


class Order implements Comparable<Order> {
    private int orderNumber;
    private String orderName;
    private String customerName;

    public Order(int orderNumber, String orderName, String customerName) {
        this.orderNumber = orderNumber;
        this.orderName = orderName;
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public int compareTo(Order other) {
        if (this.orderNumber == other.orderNumber) {
            return this.orderName.compareTo(other.orderName);
        }
        return Integer.compare(this.orderNumber, other.orderNumber);
    }
}