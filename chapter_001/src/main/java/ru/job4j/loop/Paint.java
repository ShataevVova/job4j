package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Shataev Vladimir (shataevvova@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
	//РЕФАКТОРИНГ КОДА, ЛЯБДЫ. ПРИМЕР ИСПОЛЬЗОВАНИЯ.
public class Paint {
    //Правый треугольник.
    public String rightTrl(int height) {
	/*	// Буфер для результата.
        StringBuilder screen = new StringBuilder();
		// Ширина будет равна высоте.
		int width = height;
		// Внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
			// внутренний цикл определяет положение ячейки в строке.
			for (int column = 0; column != width; column++) {
				// если строка равна ячейки, то рисуем галку.
                // в данном случае строка определяет, сколько галок будет в строке.
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(System.lineSeparator());
        }
		// Получаем результат.
        //System.out.print(screen.toString());
        System.out.println("Правый треугольник");
        return screen.toString();
	}
	*/
		return this.loopBy(
				height,
				height,
				(row, column) -> row >= column
		);
	}
	 	// Левый треугольник.
	public String leftTrl(int height) {
		/* StringBuilder screen = new StringBuilder();
		int width = height;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != width; column++) {
				if (row >= width - column - 1) {
                screen.append("^");
				} else {
					screen.append(" ");
				}
        }
        screen.append(System.lineSeparator());
		}
        System.out.println("Левый треугольник");
		return screen.toString();
		*/
		return this.loopBy(
				height,
				height,
				(row, column) -> row >= height - column - 1
		);
	}
	// Пирамида целиком.
	public String pyramid(int height) {
		/* StringBuilder screen = new StringBuilder();
		int width = 2 * height - 1;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != width; column++) {
				if (row >= height - column - 1 && row + height - 1 >= column) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		//System.out.println(screen.toString());
        System.out.println("Пирамида");
		return screen.toString();
		 */
		return this.loopBy(
				height,
				2 * height - 1,
				(row, column) -> row >= height - column - 1 && row + height - 1 >= column
		);
    }
	private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
		StringBuilder screen = new StringBuilder();
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != width; column++) {
				if (predict.test(row, column)) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
}