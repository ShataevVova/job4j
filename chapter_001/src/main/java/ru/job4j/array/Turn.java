package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public int[] back(int[] array) {
        System.out.println("принятый массив: " + Arrays.toString(array));
        int temp;

        for (int i = 0; i != array.length / 2; i++) {
            //System.out.println(array.length);
            temp = array[array.length - i - 1];
            //System.out.println(temp);
            array[array.length - i - 1] = array[i];
            array[i] = temp;
           // System.out.println(array[i]);
        }
        System.out.println("перевёрнутый массив: " + Arrays.toString(array));
        return array;
    }
}

