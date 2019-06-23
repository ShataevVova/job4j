package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";
    /**
     * Константа для показа всех заявок.
     */
    private static final String SHOWALL = "1";
    /**
     * Константа редактирования заявки.
     */
    private static final String EDITITEM = "2";
    /**
     * Константа удаления заявки.
     */
    private static final String DELETEITEM = "3";
    /**
     * Константа нахождения заявки по id.
     */
    private static final String FINDBYID = "4";
    /**
     * Константа нахождения заявки по имени.
     */
    private static final String FINDBYNAME = "5";
    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;
    /**
     * Конструктор инициализирующий поля.
     * @param input - ввод данных.
     * @param tracker - хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Основной цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem(); // добавление заявки.
            } else if (SHOWALL.equals(answer)) {
                this.showAllItems(); // показать все заявки.
            } else if (EDITITEM.equals(answer)) {
                this.editItem(); // редактирование заявки.
            } else if (DELETEITEM.equals(answer)) {
                this.delete();
            } else if (FINDBYID.equals(answer)) {
                this.findItemById();
            } else if (FINDBYNAME.equals(answer)) {
                this.findItemByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }
    /**
     * Метод реализует добавлене новой заявки в хранилище.
     */
    private void createItem() {
        System.out.println("---------- Добавление новой заявки : ");
        String name = this.input.ask("Введите имя заявки : ");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, 1234L);
        this.tracker.add(item);
        System.out.println("------------- Новая заявка с getId : " + item.getId() + " -----------");
    }

    /**
     * Метод показывает меню.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select: ");
    }

    /**
     * Метод выводит все заявки.
     */
    private void showAllItems() {
        System.out.println("---------- Показать все заявки -----------");
        Item[] items = this.tracker.findAll();
        StringBuilder listItem = new StringBuilder();
        for (Item item : items) {
            listItem.append(" --------- name: ").append(item.getName());
            listItem.append(" --------- desc: ").append(item.getDesc());
        }
        System.out.println(listItem.toString());
    }

    /**
     * Метод для редактирования заявки.
     */
    private void editItem() {
        System.out.println("---------- Редактирование заявки -----------");
        String id = this.input.ask("Введите id заявки ");
        Item item = new Item(this.input.ask("Введите имя заявки "), this.input.ask("Введите desc заявки "), 1245L);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена: name: " + item.getName() + " id: " + item.getId() + " desc: " + item.getDesc());
        } else {
           System.out.println("Заявка не найдена");
        }
    }

    /**
     * Метод для удаления заявки.
     */
    private void delete() {
        System.out.println("---------- Удаление заявки -----------");
        System.out.println("---------- Введите ID заявки -----------");
        String id = this.input.ask(" Введите id заявки ");
        if (this.tracker.delete(id)) {
            System.out.println(" Заявка удалена ");
        } else {
                System.out.println(" Заявка не найдена ");
            }
    }

    /**
     * Метожд поиска заявки по ID.
     */
    private void findItemById() {
        System.out.println("---------- Поиск заявки по id -----------");
        String id = this.input.ask(" Введите id заявки ");
        Item item = this.tracker.findById(id);
        if (item != null) {
            System.out.println(" Найдена заявка: " + "name: " + item.getName() + " " + "desc: " + item.getDesc());
        } else {
            System.out.println(" Заявка не найдена: ");
        }
    }

    /**
     * Метод поиска заявки по имени.
     */
    private void findItemByName() {
        System.out.println("---------- Поиск заявки по имени -----------");
        String name = this.input.ask(" Введите имя заявки ");
        Item[] item = this.tracker.findByName(name);
        if (item != null) {
            for (int i = 0; i < item.length; i++) {
                System.out.println(" Заявка: " + " name: " + item[i].getName() + " desc: " + item[i].getDesc());
            }
        }  else {
            System.out.println(" Заявка не найдена: ");
        }
    }
    /**
     * Запуск программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
