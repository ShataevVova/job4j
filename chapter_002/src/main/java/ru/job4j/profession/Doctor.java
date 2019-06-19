package ru.job4j.profession;
/**
 * Класс Doctor является подклассом суперкласса Profession.
 * @author Shataev Vladimir
 * @version 1.0
 * @since 29.05.2019
 * specialization - специализация.
 * diagnosis - диагноз.
 * experience - опыт.
 * patients - кол-во пациентов.
 * метод heal - вылечить.
 */
public class Doctor extends Profession {
    private String specialization;
    private String diagnosis;
    private int experience;
    private int patients;

    public Doctor(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }
    public String getSpecialization() {
        return specialization;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public int getExperience() {
        return experience;
    }
    public int getPatients() {
        return patients;
    }
    public void heal() {

    }
}
