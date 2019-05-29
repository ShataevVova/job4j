package ru.job4j.profession;
/**
 * Класс Engineer является подклассом суперкласса Profession.
 * @author Shataev Vladimir
 * @version 1.0
 * @since 29.05.2019
 * area - область деятельности.
 * projects - кол-во проектов.
 * метод calculate - производить расчёт.
 */
public class Engineer extends Profession {
    private String area;
    private int projects;

    public Engineer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }
    public String getArea() {
        return area;
    }
    public int getProjects() {
        return projects;
    }
    public void calculate() {

    }

}
