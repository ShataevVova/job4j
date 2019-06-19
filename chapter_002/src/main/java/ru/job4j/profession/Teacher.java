package ru.job4j.profession;
/**
 * Класс Teacher является подклассом суперкласса Profession.
 * @author Shataev Vladimir
 * @version 1.0
 * @since 29.05.2019
 * levelSchool - преподаватель в каких кслассах (старших или младших).
 * projects - кол-во проектов.
 * specialization - специализация.
 * busy - занятость (полная, неполная).
 */
public class Teacher extends Profession {
    private String levelSchool;
    private String specialization;
    private String busy;

    public Teacher(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }
    public String getLevelSchool() {
        return levelSchool;
    }
    public String getSpecialization() {
        return specialization;
    }
    public String getBusy() {
        return busy;
    }
    public void teach() {

    }
}
