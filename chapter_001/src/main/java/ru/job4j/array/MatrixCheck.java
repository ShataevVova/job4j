package ru.job4j.array;

import java.util.Arrays;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0][0] != data[i][i]) {
                result = false;
                break;
            }
            if (data[data.length - 1][0] != data[i][data.length - i - 1]) {
                result = false;
                break;
            }
        }
        System.out.println("Массив размером " + data.length + "x" + data.length);
        System.out.println(Arrays.deepToString(data));
        if (result) {
            System.out.println("Диагонали содержат одинаковые значения ");
        } else {
            System.out.println("Диагонали содержат разные значения ");
        }
        return result;
    }
}







