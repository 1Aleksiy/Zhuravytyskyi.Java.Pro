package com.hillel.zhuravytskii.homeworks.homework15;

import java.util.Arrays;

public class CocktailSort {
    public static void cocktailSort(int[] arr) {
        boolean swapped;
        int start = 0;
        int end = arr.length - 1;

        do {
            swapped = false;

            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;
            end--;

            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }

            start++;
        } while (swapped);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 3, 3, 4, 7, 1, 6};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        cocktailSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
