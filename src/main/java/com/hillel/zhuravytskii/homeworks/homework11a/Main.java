package com.hillel.zhuravytskii.homeworks.homework11a;

public class Main {
    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation(120); // Початкова кількість палива - 100


        Thread thread1 = new Thread(() -> petrolStation.doRefuel(30));
        Thread thread2 = new Thread(() -> petrolStation.doRefuel(25));
        Thread thread3 = new Thread(() -> petrolStation.doRefuel(20));
        Thread thread4 = new Thread(() -> petrolStation.doRefuel(50));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
