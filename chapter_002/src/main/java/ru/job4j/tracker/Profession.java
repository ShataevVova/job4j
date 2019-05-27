package ru.job4j.tracker;

public class Profession {
    public String name;
    public String surname;
    public String education;
    public int birthday;
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
}
