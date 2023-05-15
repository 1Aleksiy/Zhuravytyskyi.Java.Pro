package com.hillel.zhuravytskii.homeworks.homework10;

public class ValueCalculator {
    private float[] array;
    private int size;

    public float[] getArray() {
        return array;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int getHalfSize() {
        return size / 2;
    }

    public void calculateValues() {
        long start = System.currentTimeMillis();

        // Заповнення масиву одиницями
        array = new float[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1.0f;
        }

        // Розбиття масиву на два масиви однакової величини
        int half = size / 2;
        float[] a1 = new float[half];
        float[] a2 = new float[half];

        System.arraycopy(array, 0, a1, 0, half);
        System.arraycopy(array, half, a2, 0, half);

        // Створення та запуск двох потоків
        Thread thread1 = new Thread(() -> calculateValuesInRange(a1, 0, half));
        Thread thread2 = new Thread(() -> calculateValuesInRange(a2, 0, half));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Зворотне склеювання двох масивів в один
        System.arraycopy(a1, 0, array, 0, half);
        System.arraycopy(a2, 0, array, half, half);

        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("Час виконання: " + elapsedTime + " мс");
    }

    private void calculateValuesInRange(float[] array, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}