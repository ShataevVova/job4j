package ru.job4j.array;

public class Win {

    public boolean isWin(int[][] table) {
        boolean result = false;
        int counthor = 0;
        int countvert = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] == 1) {
                    countvert++; // счётчик по вертикали.
                }
                if (table[j][i] == 1) {
                    counthor++; // счётчик по горизонтали.

                }
            }
            if (counthor == table.length || countvert == table.length) {
                result = true;
                break;
            }
            counthor = 0;
            countvert = 0;
        }


        System.out.println(result);
        return result;
    }
}



