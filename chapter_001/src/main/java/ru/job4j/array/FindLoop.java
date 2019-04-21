package ru.job4j.array;

import java.util.Arrays;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index != data.length; index++) {
            //System.out.println("передано значение " + data[index]); //посмотреть содержимое ячейки.
            if (data[index] == el) { //если содержимое ячейки равно переданному значению, то вернуть индекс ячейки.
                rst = index;
                break;
            }
        }
		if (rst != -1) {
            System.out.println("индекс ячейки содержащей занчение " + el + " равно " + rst);
		}	else {
            System.out.println("индекс ячейки содержащей занчение " + el + " Значение индекса не найдено " + rst);
        }
        return rst;
    }

}