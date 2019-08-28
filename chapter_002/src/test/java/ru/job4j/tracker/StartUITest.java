package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class StartUITest {
    /**
     * Константа для вывода основного меню.
     * lineSep - перевод строки.
     * MENU - объект меню.
     */
    public final static String LINESEP = System.lineSeparator();
    public final static StringBuilder MENU = new StringBuilder()
            //.append("Меню.").append(LINESEP)
            .append("0. Add new Item").append(LINESEP)
            .append("1. Show all Items").append(LINESEP)
            .append("2. Edit item").append(LINESEP)
            .append("3. Delete item").append(LINESEP)
            .append("4. Find item by ID").append(LINESEP)
            .append("5. Find item by Name").append(LINESEP)
            .append("6. Exit program").append(LINESEP);
            //.append("Select: ").append(LINESEP);



    private Tracker tracker = new Tracker(); // создаём новое хранилище заявок.
    private final PrintStream stdout = System.out; // поле, содержащее стандартный вывод в консоль.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream(); //буфер для результата.

    @Before
    public void setStart() {
        //Input input = new StubInput(new String[]{"0", "TestName1", "desc1", "0", "TestName2", "desc2", "0", "TestName3", "desc3", "1", "6"}); // автоматический ввод по сценарию.
        System.out.println("execute before method");
        // new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init().
        System.setOut(new PrintStream(this.out)); //записываем в буфер.
    }

    @After
    public void outPut() {
        System.setOut(this.stdout);
        System.out.println(" ------------ Выбран пункт 6. Exit Program -------------");
        System.out.println(" ------------ Программа завершена. Спасибо за использование! -------------");
        System.out.println("execute after method");
    }
    @Test
    public void whenUserAddItem() {
        Input input = new StubInput(new String[]{"0", "test name", "DESC", "6", "y"});   //создаём StubInput с последовательностью действий/
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }
    @Test
    public void showAllItems() {
        Item item = tracker.add(new Item("TestName", "desc", 123L)); // Добавляем тестовую заявку.
        Item item1 = tracker.add(new Item("TestName2", "desc2", 1234L));
        Item item2 = tracker.add(new Item("TestName3", "desc3", 12345L));
        Input input = new StubInput(new String[] {"1", "6", "y"});
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        StringBuilder choise = new StringBuilder();
        choise.append(MENU)//.append(LINESEP)
                .append("---------- Показать все заявки -----------").append(LINESEP)
                .append(" --------- name: ").append("TestName")//.append(LINESEP)
                .append(" --------- desc: ").append("desc")//.append(LINESEP)
                .append(" --------- name: ").append("TestName2")//.append(LINESEP)
                .append(" --------- desc: ").append("desc2")//.append(LINESEP)
                .append(" --------- name: ").append("TestName3")//.append(LINESEP)
                .append(" --------- desc: ").append("desc3").append(LINESEP)
                .append(MENU)
                .append("---------- ВЫХОД ИЗ ПРОГРАММЫ -----------").append(LINESEP);
        assertThat(out.toString(), is(choise.toString()));
    }
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "1", "6", "y"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc", 1234L));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "1", "6", "y"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }
    @Test
    public void whenDeleteThenTrackerHasDeleteValue() {
        Item item = tracker.add(new Item("test1", "первая заявка", 12L));
        Input input = new StubInput(new String[]{"3", item.getId(), "1", "6",  "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.delete(item.getId()), is(true));

    }
}