package com.example.VladProject;

import java.util.List;

public class StudentService {

    public static List<Student> getAllStudent() {
        return StudentRepository.getAllStudent();
    }

    public static Student getStudent(int id) {
        return StudentRepository.getStudent(id);
    }

    public static void removeStudent(int id) {
        StudentRepository.removeStudent(id);
    }

    public static void addStudent(int id, String name, String surname, int age, int groupid) {
        StudentRepository.addStudent(id, name, surname, age, groupid);
    }
}

