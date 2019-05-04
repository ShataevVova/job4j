package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenData4x4ByTrueThenFalse() {
        MatrixCheckRev2 check = new MatrixCheckRev2();
        boolean[][] input = new boolean[][] {
                {true, true, true, true},
                {false, true, true, false},
                {true, true, false, false},
                {true, false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }



    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheckRev2 check = new MatrixCheckRev2();
        boolean[][] input = new boolean[][] {
                {false, true, false},
                {false, false, true},
                {false, false, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataMonoByTrueThenFalse() {
        MatrixCheckRev2 check = new MatrixCheckRev2();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, true, true},
                {false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheckRev2 check = new MatrixCheckRev2();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenData2x2ByTrueThenTrue() {
        MatrixCheckRev2 check = new MatrixCheckRev2();
        boolean[][] input = new boolean[][] {
                {true, false},
                {false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenData2x2ByTrueThenFalse() {
        MatrixCheckRev2 check = new MatrixCheckRev2();
        boolean[][] input = new boolean[][] {
                {true, true},
                {false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}