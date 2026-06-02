package com.lpu.devops;
public class Student {
    private int registrationNumber;
    private String name;
    private String section;
    private double cgpa;

    // Constructor
    public Student(int registrationNumber, String name, String section, double cgpa) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.section = section;
        this.cgpa = cgpa;
    }

    // Getters and Setters
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return String.format("Student[Reg: %d, Name: %s, Section: %s, CGPA: %.2f]",
                registrationNumber, name, section, cgpa);
    }
}
