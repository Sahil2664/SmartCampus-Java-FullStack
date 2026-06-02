package com.lpu.devops;

/**
 * Student Management System - Main Application
 * CI/CD Project using Docker + Maven + GitHub Actions
 * 
 * @author Registration: 12306548
 * @course INT332 - DevOps
 * @section 20M61
 */
public class StudentManagementApp {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  Student Management System - CI/CD Project");
        System.out.println("  Registration No: 12306548 | Section: 20M61");
        System.out.println("=================================================\n");

        // Create StudentService instance
        StudentService service = new StudentService();

        // Add sample students
        System.out.println("Adding students to the system...\n");
        service.addStudent(new Student(12307, "Arjun Kumar", "20M61", 8.5));
        service.addStudent(new Student(12308, "Priya Sharma", "20M61", 9.2));
        service.addStudent(new Student(12309, "Rahul Singh", "20M61", 7.8));
        service.addStudent(new Student(12310, "Anjali Verma", "20M62", 8.9));
        service.addStudent(new Student(12311, "Vikram Patel", "20M62", 9.0));

        System.out.println("\n-------------------------------------------------");
        System.out.println("Total Students: " + service.getTotalStudents());
        System.out.println("Average CGPA: " + String.format("%.2f", service.calculateAverageCGPA()));
        System.out.println("-------------------------------------------------\n");

        // Display all students
        System.out.println("All Students in the System:");
        for (Student student : service.getAllStudents()) {
            System.out.println("  " + student);
        }

        // Find specific student
        System.out.println("\n-------------------------------------------------");
        System.out.println("Searching for student with Reg No: 12307");
        service.findStudentByRegNo(12307).ifPresent(student -> 
            System.out.println("Found: " + student)
        );

        // Get students by section
        System.out.println("\n-------------------------------------------------");
        System.out.println("Students in Section 20M61:");
        for (Student student : service.getStudentsBySection("20M61")) {
            System.out.println("  " + student);
        }

        System.out.println("\n=================================================");
        System.out.println("  Application executed successfully!");
        System.out.println("  CI/CD Pipeline: Docker + Maven + GitHub Actions");
        System.out.println("=================================================\n");
    }
}
