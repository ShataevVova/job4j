package ru.job4j.tracker;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String Add = "0";
    /**
     * Константа для показа всех заявок.
     */
    private static final String ShowAll = "1";
    /**
     * Константа редактирования заявки.
     */
    private static final String EditItem = "2";
    /**
     * Константа удаления заявки.
     */
    private static final String DeleteItem = "3";
    /**
     * Константа нахождения заявки по id.
     */
    private static final String FindItemById = "4";
    /**
     * Константа нахождения заявки по имени.
     */
    private static final String FindItemByName = "5";
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
        while(!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if(Add.equals(answer)) {
                //добавление заявки вынесено в отдельный метод.
                this.createItem();
            } else if(ShowAll.equals(answer)) {
                this.findAll(); // показать все заявки.
            } else if(EditItem.equals(answer)) {
                this.replace(); // редактирование заявки.
            } else if(DeleteItem.equals(answer)) {
                this.delete();
            } else if(FindItemById.equals(answer)) {
                this.findById();
            } else if(FindItemByName.equals(answer)) {
                this.findByName();
            } else if(EXIT.equals(answer)) {
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
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------- Новая заявка с getId : " + item.getId() + "-----------");
    }
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
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
