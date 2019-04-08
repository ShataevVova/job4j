package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
	// максимальное из 2х чисел.
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
	// первое число максимальное.
	@Test
	public void whenLeftBiggerThenRight() {
		Max max = new Max();
		int result = max.max(3, 1);
		assertThat(result, is(3));
	}
	// второе число максимальное.
	@Test
	public void whenRightBiggerThenLeft() {
		Max max = new Max();
		int result = max.max(1, 4);
		assertThat(result, is(4));
	}
	// если оба числа равны.
	@Test
	public void leftEqualRight() {
		Max max = new Max();
		int result = max.max(1, 1);
		assertThat(result, is(1));
	}
}

		
