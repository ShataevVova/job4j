package ru.job4j.tracker;

public class EnglishTeacher extends Teacher {
    public EnglishTeacher(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }
    public String classname;
    public String language;
    public String getClassname(){
        return classname;
    }
    public String getLanguage() {
        return language;
    }

}
