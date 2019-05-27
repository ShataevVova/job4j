package ru.job4j.tracker;

public class Terapevt extends Doctor {
    public Terapevt(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }
    public String category;
    public String getCategory() {
        return category;
    }
}
