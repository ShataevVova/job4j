package ru.job4j.tracker;

import java.util.Objects;

/**
 * Класс Item описывает бизнес модель заявки.
 * @author Shataev Vladimir
 * @version 1.0
 * @since 05.06.2019
 * поле id - уникальный ключ.
 * поле name - имя.
 * поле desc - описание заявки.
 * поле time - время создания заявки.
 */
public class Item {
    /**
     * Поле id - идентификкатор элемента массива.
     * формируется из текущего времени в милисеках и случайного числа.
     * Поле name - имя элемента массива.
     * Поле description - содержит комментарий/ описание объекта.
     * Поле time - время создание объекта в милисеках.
     */
    private String id;
    private String name;
    private String  desc;
    private long time;

    public Item(String name, String desc, long time) {
        this.name = name;
        this.desc = desc;
        this.time = time;
    }
    public String getId() {
        return id;
    }
    public  void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.name = desc;
    }
    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time && Objects.equals(id, item.id) && Objects.equals(name, item.name) && Objects.equals(desc, item.desc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, time);
    }
}
