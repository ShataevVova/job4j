package ru.job4j.array;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] array) {
        System.out.println("принятый массив: " + Arrays.toString(array));
        int temp;
        /* находим максимальное из двух соседних чисел.

         */
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("отсортированный массив: " + Arrays.toString(array));
        return array;
    }
}

