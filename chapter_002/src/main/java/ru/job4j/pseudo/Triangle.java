package ru.job4j.pseudo;

import java.util.Arrays;

/**
 * @author Shataev Vladimir (shataevova@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   *   ");
        pic.append(System.lineSeparator());
        pic.append("  ***  ");
        pic.append(System.lineSeparator());
        pic.append(" ***** ");
        pic.append(System.lineSeparator());
        pic.append("*******");
        pic.append(System.lineSeparator());
        return pic.toString();
    }
}
