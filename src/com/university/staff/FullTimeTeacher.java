package com.university.staff;

public class FullTimeTeacher extends Teacher {
    private int yearsExperience;

    public FullTimeTeacher(int identification, String name, double baseSalary) {
        super(identification, name, baseSalary);
    }

    public FullTimeTeacher(int identification, String name, double baseSalary, int yearsExperience) {
        super(identification, name, baseSalary);
        this.yearsExperience = yearsExperience;
    }

    @Override
    public double calculateSalary() {
        double experience = yearsExperience * 1.1;
        return getBaseSalary() * experience;
    }
}
