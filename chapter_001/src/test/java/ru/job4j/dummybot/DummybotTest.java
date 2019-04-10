package ru.job4j.dummybot;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**@author Vladimir Shataev (shayaevvova@yandex.ru).
 *@version $Id$
 * @since 0.1
 */
public class DummybotTest {
    //ответ на приветствие. 
	@Test
    public void whenGreetBot() {
        Dummybot bot = new Dummybot();
        assertThat(
                bot.answer("Привет, Бот."),
                is("Привет, умник.")
        );
    }
	// ответ на "пока".
    @Test
    public void whenByeBot() {
        Dummybot bot = new Dummybot();
        assertThat(
                bot.answer("Пока."),
                is("До скорой встречи.")
        );
    }
	// ответ, когда не знает ответа.
    @Test
    public void whenUnknownBot() {
        Dummybot bot = new Dummybot();
        assertThat(
                bot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}