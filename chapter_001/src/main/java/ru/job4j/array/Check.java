package ru.job4j.array;

import java.util.Arrays;

public class Check {
    public boolean mono(boolean[] data) {

        boolean result = true;
        System.out.println("Заданный массив: " + Arrays.toString(data));
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
               result = false;
                break;
            }
        }
            if (result) {
                System.out.println("Все элементы массива одинаковы");
            } else {
                System.out.println("Содержит разные значения");
            }
        return result;
    }
}






