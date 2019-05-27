package ru.job4j.tracker;

public class Engineer extends Profession {
    public int projects;

    public Engineer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }
    public int getProjects() {
        return projects;
    }

}
