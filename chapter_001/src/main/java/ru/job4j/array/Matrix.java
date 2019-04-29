package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) { // цикл по строкам.
            for (int j = 0; j < size; j++) { // цикл по столбцам.
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + "|");
            }
            System.out.println();
        }
        return table;
    }
}