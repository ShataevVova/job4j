package ru.job4j.profession;
/**
 * Класс Constructor является подклассом суперкласса Engineer b мупер-супер класса Profession.
 * @author Shataev Vladimir
 * @version 1.0
 * @since 29.05.2019
 * area - область деятельности.
 * projects - кол-во проектов.
 * метод calculate - производить расчёт.
 */
public class Constructor extends Engineer {
    private String company;
    private String experience;

    public Constructor(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public String getCompany() {
        return company;
    }
    public String getExperience() {
        return experience;
    }
}
