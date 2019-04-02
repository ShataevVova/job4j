package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
	@Test
	public void whenDiv2On2Then1() {
		Calculator calc = new Calculator();
		double result = calc.div(2d, 2d);
		double expected = 1d;
		assertThat(result, is(expected));
	}
	@Test
	public void whenSub2From1Then1() {
		Calculator calc = new Calculator();
		double result = calc.subtract(2d, 1d);
		double expected = 1d;
		assertThat(result, is(expected));
	}
	@Test
	public void whenMultiple2On2Then4() {
		Calculator calc = new Calculator();
		double result = calc.multiple(2d, 2d);
		double expected = 4d;
		assertThat(result, is(expected));
	}
}