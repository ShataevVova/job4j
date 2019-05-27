package ru.job4j.tracker;

public class Teacher extends Profession {
    public String levelSchool; //hight or Low.
    public Teacher(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }
    public String getLevelSchool() {
        return levelSchool;
    }
}
