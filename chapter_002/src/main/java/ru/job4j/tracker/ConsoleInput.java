package ru.job4j.tracker;
import java.util.*;

/**
 * Реализация интерфейса ручного ввода для пользователя.
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
    public int ask(String question, List<Integer> range) {
        int key = Integer.valueOf(this.ask(question)); //преобразуем ввод в числовой формат.
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("OUT of RANGE!");
        }
    }
}
