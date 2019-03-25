package ru.job4j.calculate;

import org.junit.Test;
import static org hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * 
 * @autor Vladimir Shataev (shataevvova@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class CalculateTest {
	/**
	* Test.
	*/
	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
		String input = "Vladimir Shataev";
		String expect = "Echo, echo, echo : Vladimir Shataev"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
 }
 