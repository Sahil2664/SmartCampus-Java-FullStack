package com.lpu.devops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

/**
 * Unit tests for StudentService class
 */
public class StudentServiceTest {
    private StudentService service;

    @BeforeEach
    public void setUp() {
        service = new StudentService();
    }

    @Test
    public void testAddStudent() {
        Student student = new Student(12307, "Test Student", "20M61", 8.5);
        service.addStudent(student);
        assertEquals(1, service.getTotalStudents());
    }

    @Test
    public void testFindStudentByRegNo() {
        Student student = new Student(12307, "Test Student", "20M61", 8.5);
        service.addStudent(student);
        
        Optional<Student> found = service.findStudentByRegNo(12307);
        assertTrue(found.isPresent());
        assertEquals("Test Student", found.get().getName());
    }

    @Test
    public void testCalculateAverageCGPA() {
        service.addStudent(new Student(12307, "Student 1", "20M61", 8.0));
        service.addStudent(new Student(12308, "Student 2", "20M61", 9.0));
        
        double average = service.calculateAverageCGPA();
        assertEquals(8.5, average, 0.01);
    }

    @Test
    public void testGetStudentsBySection() {
        service.addStudent(new Student(12307, "Student 1", "20M61", 8.0));
        service.addStudent(new Student(12308, "Student 2", "20M62", 9.0));
        service.addStudent(new Student(12309, "Student 3", "20M61", 7.5));
        
        List<Student> section20M61 = service.getStudentsBySection("20M61");
        assertEquals(2, section20M61.size());
    }

    @Test
    public void testRemoveStudent() {
        Student student = new Student(12307, "Test Student", "20M61", 8.5);
        service.addStudent(student);
        
        boolean removed = service.removeStudent(12307);
        assertTrue(removed);
        assertEquals(0, service.getTotalStudents());
    }

    @Test
    public void testEmptyServiceAverageCGPA() {
        double average = service.calculateAverageCGPA();
        assertEquals(0.0, average, 0.01);
    }
}
