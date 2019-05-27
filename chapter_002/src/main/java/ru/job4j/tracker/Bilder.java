package ru.job4j.tracker;

public class Bilder extends Engineer {

    public Bilder(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }
    public String company;
    public String experience;

    public String getCompany() {
        return company;
    }
    public String getExperience() {
        return experience;
    }
}
