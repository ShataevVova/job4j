package ru.job4j.profession;
/**
 * Класс languageTeacher является подклассом суперкласса Teacher.
 * @author Shataev Vladimir
 * @version 1.0
 * @since 29.05.2019
 * levelSchool - преподаватель в каких кслассах (старших или младших).
 * projects - кол-во проектов.
 * specialization - специализация.
 * busy - занятость (полная, неполная).
 * classname - номер и литера класса.
 * language - вид языка который преподаёт.
 */
public class LanguageTeacher extends Teacher {
    private String classname;
    private String language;
    public LanguageTeacher(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public String getClassname() {
        return classname;
    }
    public String getLanguage() {
            return language;
    }

}
