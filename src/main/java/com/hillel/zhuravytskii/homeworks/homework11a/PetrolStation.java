package com.hillel.zhuravytskii.homeworks.homework11a;
import java.util.concurrent.Semaphore;

public class PetrolStation {
    private int amount;
    private Semaphore semaphore;

    public PetrolStation(int initialAmount) {
        this.amount = initialAmount;
        this.semaphore = new Semaphore(3);
    }

    public void doRefuel(int requestedAmount) {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " починає заправку.");

            Thread.sleep((long) (Math.random() * 8000 + 3000));

            synchronized (this) {
                if (requestedAmount <= amount) {
                    amount -= requestedAmount;
                    System.out.println(Thread.currentThread().getName() + " заправився на " + requestedAmount + " одиниць палива.");
                } else {
                    System.out.println(Thread.currentThread().getName() + " не може заправитися, недостатньо палива.");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " закінчив заправку.");
        }
    }

    public int getAmount() {
        return amount;
    }
}