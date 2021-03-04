package com.example.VladProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
        public static List<Student> getList() {

            List<Student> studentsList = new ArrayList<>();

            Student student1 = new Student("Vlad", "Pauk", 23, 1);
            Student student2 = new Student("Artyr", "Ryduk", 24, 2);
            Student student3 = new Student("Jenia", "Diachyk", 23, 3);
            Student student4 = new Student("Artyr", "Kapshienko", 24, 4);

            studentsList.add(student1);
            studentsList.add(student2);
            studentsList.add(student3);
            studentsList.add(student4);

            return studentsList;
        }

    }

