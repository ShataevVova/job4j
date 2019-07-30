package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс Меню.
 */

public class MenuTracker {
    /**
     * @param хранит ссылку на объект.
     */
    private Input input;
    /**
     * @param хранит ссылку на объект.
     */
    private Tracker tracker;
    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return вощвращает длину массива
     */
    public int getActionsLength() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions.add(new AddItem());
        this.actions.add(new ShowItems());
        this.actions.add(new EditItem());
        this.actions.add(new DeleteItem());
        this.actions.add(new FindItemById());
        this.actions.add(new FindItemByName());
        this.actions.add(new ExitProgram());
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции.
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (actions != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Внутренний класс, добавляющий заявку.
     */
    public class AddItem implements UserAction {
        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("---------- Добавление новой заявки : ");
            String name = input.ask("Введите имя заявки : ");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc, 1234L);
            tracker.add(item);
            System.out.println("------------- Новая заявка с Id : " + item.getId() + " -----------");
            System.out.println("------------- Новая заявка с именем : " + item.getName() + " -----------");
            System.out.println("------------- Новая заявка с описанием : " + item.getDesc() + " -----------");
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add new Item.");
        }
    }

    /**
     * Внутренний класс, показывающий все заявки Item.
     */
    private static class ShowItems implements UserAction {
        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("---------- Показать все заявки -----------");
            Item[] items = tracker.findAll();
            StringBuilder listItem = new StringBuilder();
            for (Item item : items) {
                listItem.append(" --------- name: ").append(item.getName());
                listItem.append(" --------- desc: ").append(item.getDesc());
            }
            System.out.println(listItem.toString());
        }


        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all Items.");
        }
    }

    /**
     * Внутренний класс изменяющий Item.
     */
    private static class EditItem implements UserAction {
        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("---------- Редактирование заявки -----------");
            String id = input.ask("Введите id заявки ");
            Item item = new Item(input.ask("Введите имя заявки "), input.ask("Введите desc заявки "), 1245L);
            if (tracker.replace(id, item)) {
                System.out.println("Заявка изменена: name: " + item.getName() + " id: " + item.getId() + " desc: " + item.getDesc());
            } else {
                System.out.println("Заявка не найдена");
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Edit item.");
        }
    }

        /**
         * Внутренний класс удаляющий заявки.
         */
        private static class DeleteItem implements UserAction {
            @Override
            public int key() {
                return 3;
            }

            @Override
            public void execute(Input input, Tracker tracker) {
                System.out.println("---------- Удаление заявки -----------");
                System.out.println("---------- Введите ID заявки -----------");
                String id = input.ask(" Введите id заявки ");
                if (tracker.delete(id)) {
                    System.out.println(" Заявка удалена ");
                } else {
                    System.out.println(" Заявка не найдена ");
                }
            }

            @Override
            public String info() {
                return String.format("%s. %s", this.key(), "Delete item.");
            }
        }

        /**
         * Внутренний класс поиска заявки по ID.
         */
        private static class FindItemById implements UserAction {
            @Override
            public int key() {
                return 4;
            }

            @Override
            public void execute(Input input, Tracker tracker) {
                System.out.println("---------- Поиск заявки по id -----------");
                String id = input.ask(" Введите id заявки ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(" Найдена заявка: " + "name: " + item.getName() + " " + "desc: " + item.getDesc());
                } else {
                    System.out.println(" Заявка не найдена: ");
                }
            }

            @Override
            public String info() {
                return String.format("%s. %s", this.key(), "Find item by ID.");
            }
        }

        /**
         * Внутренний класс поиска заявки по имени.
         */
        private static class FindItemByName implements UserAction {
            @Override
            public int key() {
                return 5;
            }

            @Override
            public void execute(Input input, Tracker tracker) {
                System.out.println("---------- Поиск заявки по имени -----------");
                String name = input.ask(" Введите имя заявки ");
                Item[] item = tracker.findByName(name);
                if (item != null) {
                    for (int i = 0; i < item.length; i++) {
                        System.out.println(" Заявка: " + " name: " + item[i].getName() + " desc: " + item[i].getDesc());
                    }
                } else {
                    System.out.println(" Заявка не найдена: ");
                }
            }

            @Override
            public String info() {
                return String.format("%s. %s", this.key(), "Find item by Name.");
            }
        }

        /**
         * Внутренний класс Выхода из программы.
         */
        private static class ExitProgram implements UserAction {
            @Override
            public int key() {
                return 6;
            }

            @Override
            public void execute(Input input, Tracker tracker) {
                System.out.println("---------- Поиск заявки по имени -----------");
                String name = input.ask(" Введите имя заявки ");
                Item[] item = tracker.findByName(name);
                if (item != null) {
                    for (int i = 0; i < item.length; i++) {
                        System.out.println(" Заявка: " + " name: " + item[i].getName() + " desc: " + item[i].getDesc());
                    }
                } else {
                    System.out.println(" Заявка не найдена: ");
                }
            }

            @Override
            public String info() {
                return String.format("%s. %s", this.key(), "Find item by Name.");
            }
        }
    }



