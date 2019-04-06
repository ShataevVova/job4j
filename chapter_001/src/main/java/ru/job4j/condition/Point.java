package ru.job4j.condition;
/**
 * Condition.
 * Вычисление расстояния между точками в системе координат.
 *@author Vladimir Shataev (shayaevvova@yandex.ru)

*/
public class Point {
    public double distance(int x1, int y1, int x2, int y2) {
		double first = Math.pow(x2 - x1, 2);
		double second = Math.pow(y2 - y1, 2);
		double add = (first + second);
        return (Math.sqrt(add));
    }
}