package ru.job4j.profession;
/**
 * Класс Therapist является подклассом суперкласса Doctor и супер-суперкласса Profession.
 * @author Shataev Vladimir
 * @version 1.0
 * @since 29.05.2019
 * specialization - специализация.
 * diagnosis - диагноз.
 * experience - опыт (лет)
 * patients - кол-во пациентов.
 * метод heal - вылечить.
 */
public class Therapist extends Doctor {
    private String category;
    public Therapist(String name, String surname, String education, int birthday, int experience) {
        super(name, surname, education, birthday);
    }

    public String getCategory() {
        return category;
    }
}
