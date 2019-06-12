package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));

    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void whenDeleteSecondOneItemReturnAllItemsWithOutSecondOne() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "previous", 123L);
        Item firstOne = new Item("test2", "first", 1234L);
        Item secondOne = new Item("test3", "second", 12345L);
        Item thirdOne = new Item("test3", "third", 12345L);
        tracker.add(previous);
        tracker.add(firstOne);
        tracker.add(secondOne);
        tracker.add(thirdOne);
        String secondOneId = secondOne.getId();
        tracker.delete(secondOneId);
        Item[] expect = {previous, firstOne, thirdOne};
        assertThat(tracker.findAll(), is(expect));
    }
    @Test
    public void whenFindAllIsAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "first", 123L);
        Item second = new Item("test2", "second", 1234L);
        tracker.add(first);
        tracker.add(second);
        Item[] expect = {first, second};
        assertThat(tracker.findAll(), is(expect));
    }
    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "previous", 123L);
        Item first = new Item("test2", "first", 1234L);
        Item second = new Item("test3", "second", 12345L);
        Item third = new Item("test1", "third", 12345L);
        tracker.add(previous);
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        Item[] expect = {previous, third};
        assertThat(tracker.findByName("test1"), is(expect));
    }
    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "previous", 123L);
        Item first = new Item("test2", "first", 1234L);
        Item second = new Item("test3", "second", 12345L);
        Item third = new Item("test4", "third", 12345L);
        tracker.add(previous);
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        assertThat(tracker.findById(third.getId()), is(third));
    }
}
