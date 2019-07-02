package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Shataev Vladimir (shataevova@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    // получаем ссылку на стандартный вывод в консоль.
    private final PrintStream stdout = System.out;
    // Создаем буфер для хранения вывода.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @Before
    public void loadOutput() {
        System.out.println("Execute before method");
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("Execute after method");
    }
    @Test
    public void whenDrawSquare() {
        /*Paint paint = new Paint();
        paint.draw(new Triangle());
        */
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                this.out.toString(),
                is(
                        new StringBuilder()
                                .append(" ----- ")
                                .append(System.lineSeparator())
                                .append("|     |")
                                .append(System.lineSeparator())
                                .append("|     |")
                                .append(System.lineSeparator())
                                .append("|     |")
                                .append(System.lineSeparator())
                                .append(" ----- ")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Triangle());
        // проверяем результат вычисления
        assertThat(
                this.out.toString(),
                is(
                        new StringBuilder()
                                .append("   *   ")
                                .append(System.lineSeparator())
                                .append("  ***  ")
                                .append(System.lineSeparator())
                                .append(" ***** ")
                                .append(System.lineSeparator())
                                .append("*******")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}
