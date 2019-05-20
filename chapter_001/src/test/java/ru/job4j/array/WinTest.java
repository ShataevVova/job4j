package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WinTest {
    @Test
    public void whenVerticalWin() {
        Win win = new Win();
        int[][] inputtab = new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        boolean result = win.isWin(inputtab);

        assertThat(result, is(true));
    }

    @Test
    public void whenHorizontalWin() {
        Win win = new Win();
        int[][] inputtab = new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        boolean result = win.isWin(inputtab);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotWin() {
        Win win = new Win();
        int[][] inputtab = new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        boolean result = win.isWin(inputtab);
        assertThat(result, is(false));
    }
    @Test
    public void whenNotWinWhenHorTrue() {
        Win win = new Win();
        int[][] inputtab = new int[][] {
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
        };
        boolean result = win.isWin(inputtab);
        assertThat(result, is(true));
    }
    @Test
    public void whenVerticalfalse() {
        Win win = new Win();
        int[][] inputtab = new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        boolean result = win.isWin(inputtab);

        assertThat(result, is(false));
    }
}