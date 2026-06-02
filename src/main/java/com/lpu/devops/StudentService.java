package com.lpu.devops;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Student Service Class
 * Handles business logic for student management operations
 */
public class StudentService {
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    /**
     * Add a new student to the system
     */
    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
            System.out.println("Student added successfully: " + student);
        }
    }

    /**
     * Find student by registration number
     */
    public Optional<Student> findStudentByRegNo(int regNo) {
        return students.stream()
                .filter(s -> s.getRegistrationNumber() == regNo)
                .findFirst();
    }

    /**
     * Get all students
     */
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    /**
     * Calculate average CGPA of all students
     */
    public double calculateAverageCGPA() {
        if (students.isEmpty()) {
            return 0.0;
        }
        return students.stream()
                .mapToDouble(Student::getCgpa)
                .average()
                .orElse(0.0);
    }

    /**
     * Get students by section
     */
    public List<Student> getStudentsBySection(String section) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getSection().equalsIgnoreCase(section)) {
                result.add(student);
            }
        }
        return result;
    }

    /**
     * Get count of total students
     */
    public int getTotalStudents() {
        return students.size();
    }

    /**
     * Remove student by registration number
     */
    public boolean removeStudent(int regNo) {
        return students.removeIf(s -> s.getRegistrationNumber() == regNo);
    }
}
