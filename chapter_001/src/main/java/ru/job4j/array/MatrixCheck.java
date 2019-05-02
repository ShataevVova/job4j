package ru.job4j.array;

import java.util.Arrays;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean leftDiagonal = true;
        boolean rightDiagonal = true;
        System.out.println("Заданный массив: " + Arrays.deepToString(data) + "\t");
        System.out.println("Размер массива: " + data.length + "x" + data[0].length);
        // перебор по строкам.
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) { // перебор по столбцам.
                if (i == j) { // рассматриваются только элемены по диагонали матрицы.
                    System.out.println("в индексе " + i + j + " содержится " + data[i][j] + "*");
                    System.out.println("в индексе " + (data.length - i - 1) + j + " содержится " + data[data.length - i - 1][j] + "| " + " ");
                    if ((data[0][0] != data[data.length - i - 1][j])) {
                        rightDiagonal = false;
                        break;
                    }
                    if ((data[0][0] != data[i][j])) {
                        leftDiagonal = false;
                        break;
                    }
                }
            }
        }
        if (rightDiagonal) {
            System.out.println("Правая диагональ массива содержит одинаковые значения: (" + data[0][0] + ") => " + rightDiagonal);
        } else {
            System.out.println("Правая диагональ массива содержит разные значения => " + rightDiagonal);
        }
        if (leftDiagonal) {
            System.out.println("Левая диагональ массива содержит одинаковые значения: (" + data[0][0] + ") => " + leftDiagonal);
        } else {
            System.out.println("Левая диагональ массива содержит разные значения => " + leftDiagonal);
        }

        if (!(rightDiagonal && leftDiagonal)) {
            result = false;
            System.out.println("Левые и правые диагонали ОТЛИЧАЮТСЯ друг от друга (" + leftDiagonal + " && " + rightDiagonal  + " = " + result + ")");
            System.out.println("=> Диагонали массива НЕ СОДЕРЖАТ ОДИНАКОВЫЕ ЗНАЧЕНИЯ элементов ");
            System.out.println();
        } else {
            System.out.println("Левые и правые диагонали ОДИНАКОВЫ (" + leftDiagonal + " && " + rightDiagonal  + " = " + result + ")");
            System.out.println("=> Диагонали массива СОДЕРЖАТ ОДИНАКОВЫЕ ЗНАЧЕНИЯ элементов ");
            System.out.println();
        }
        return result;
    }
}








