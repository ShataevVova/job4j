package ru.job4j.profession;

/**
 * Класс Profession является суперклассом, описывающим профессии.
 * @author Shataev Vladimir
 * @version 1.0
 * @since 29.05.2019
 * метод salary - расчёт зарплаты.
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;
    public Profession(String name, String surname, String education, int birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEducation() {
        return education;
    }
    public int getBirthday() {
        return birthday;
    }
    public  void salary() {

    }
}
