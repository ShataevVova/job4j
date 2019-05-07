package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] exceptArray = {"Привет", "Мир", "Супер"};
        ArrayDuplicate rmDuplicate = new ArrayDuplicate();
        String[] resultArray = rmDuplicate.remove(input);
        assertThat(resultArray, is(exceptArray));
    }
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateSecondTest() {
        String[] input = {"Мир", "Труд", "Труд", "Мир", "Май"};
        String[] exceptArray = {"Мир", "Труд", "Май"};
        ArrayDuplicate rmDuplicate = new ArrayDuplicate();
        String[] resultArray = rmDuplicate.remove(input);
        assertThat(resultArray, is(exceptArray));
    }
}