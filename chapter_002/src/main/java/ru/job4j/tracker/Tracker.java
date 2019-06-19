package ru.job4j.tracker;
import java.util.*;
/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    /**
     * Генератор случайных чисел.
     */
    private static final Random RN = new Random();
    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    /**
     * Метод заменяющий ячейку в массиве this.items.
     * @param id - id ячейки в массиве, кот. требуется заменить.
     * @param item - объект на который заменяется старый объект.
     * @return true - логическое значение, сообщающее о результате замены объекта.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                this.items[index] = item;
                this.items[index].setId(id);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаления объекта из массива по соответствующему id.
     * @param id - входящий id ячейки массива, кот. необходимо удалить.
     * @return возвращает true, если удаление произведено.
     * перебераем позиции массива пока не находим икомую, после чего копируем исходный
     * массив со сдвигом вправо.
     * position-- - уменьшили длину массива на 1 позицию после копирования.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                System.arraycopy(this.items, index + 1, this.items, index, this.position - index + 1);
                this.items[this.position--] = null;
                result = true;
                break;
            }
        }
        return true;
    }

    /**
     * Метод возвроащает копию массива items без null элементов.
     * @return
     */
    public Item[] findAll() {

        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод проверяет элементы массива this.items, сравнивая name.
     * Элементы у которых name совпадает - копируются в результирующий массив и возвращает его.
     * @param key - то с чем сравнивается name.
     * @return
     */
    public Item[] findByName(String key) {
        int count = 0;
        Item[] itemName = new Item[position];
        for (int i = 0; i < position; i++) {
            if (this.items[i].getName().equals(key)) {
                itemName[count] = this.items[i];
                count++;
            }
        }
        return Arrays.copyOf(itemName, count);
    }

    /**
     * Метод fundById проверяет в цикле все элементы массива this.items,
     * сравнивая id c аргументом String id и возвращает найденный Item.
     * Если Item не найден - возвращает null.
     * @param id - который будет сравниваться с id элемента массива.
     * @return item - если id равны, если нет - то null.
     */
    public Item findById(String id) {
        Item result = null;
        /*int count = 0;
        for (Item item: items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            } else if (item == null){
                count++;
                break;
            }
            */
        for(int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }
        }
        //System.out.println("Количество итераций, если в массиве нет ни одной заявки: " + count);
        return result;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание.
     * Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ. (время в милисеках + случайное число от 0 до 100.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
    }
}
