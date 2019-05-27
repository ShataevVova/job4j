package ru.job4j.tracker;

public class Doctor extends Profession {
    public String specialization;
    public String diagnosis;
    public int experience;
    public int patients;

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
}
