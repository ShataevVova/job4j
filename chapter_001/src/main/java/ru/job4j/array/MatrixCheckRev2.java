package ru.job4j.array;

import java.util.Arrays;

public class MatrixCheckRev2 {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        System.out.println("Заданный массив: " + Arrays.deepToString(data) + " размером: " + data.length + "x" + data[0].length);
        if (data.length != 2) {
            for (int i = 0; i < data.length; i++) {
                if (data[0][0] != data[i][i]) {
                    result = false;
                    break;
                }
                if (data[0][0] != data[data.length - i - 1][i]) {
                    result = false;
                    break;
                }
            }
        } else {
            if ((data[0][0] != data[1][1]) || (data[1][0] != data[0][1])) {
                result = false;
            }
            if (result) {
                System.out.println("Диагонали массива 2х2 содержат одинаковые значения ");
                System.out.println("=> результат " + result);
            } else {
                System.out.println("Диагонали массива 2х2 содержит разные значения ");
                System.out.println("=> результат " + result);
            }
        }
        if ((data.length > 2) && (result)) {
            System.out.println("Левая и правая диагонали сожержат одинаковые значения => " + result);
        } else {
            System.out.println("Левая и правая диагонали сожержат разные значения => " + result);
        }
        return result;
    }
}







