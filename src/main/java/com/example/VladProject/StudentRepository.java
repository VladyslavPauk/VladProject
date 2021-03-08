package com.example.VladProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static Statement createStatement() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Statement statement = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_db", "postgres", "0708");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }


    public static List<Student> getAllStudent() {
        Statement statement = createStatement();

        List<Student> studentList = new ArrayList<>();

        try {
            ResultSet resultSet = statement.executeQuery("select * from Student");

            while (resultSet.next()) {
                Student student = new Student();
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setAge(resultSet.getInt("age"));
                student.setGroupId(resultSet.getInt("groupid"));
                student.setId(resultSet.getInt("id"));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public static Student getStudent(int id) {
        Statement statement = createStatement();

        Student student = null;
        try {
            ResultSet resultSet = statement.executeQuery("select * from Student where id = " + id);
            if (resultSet.next()) {
                student = new Student();
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setAge(resultSet.getInt("age"));
                student.setGroupId(resultSet.getInt("groupid"));
                student.setId(resultSet.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    public static void removeStudent(int id) {
        Statement statement = createStatement();
        try {
            statement.executeUpdate("delete from Student where id =" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addStudent(int id, String name, String surname, int age, int groupid) {
        Statement statement = createStatement();
        try {
            statement.executeUpdate("insert into Student (id, name, surname, age, groupid) values (" + id + ", '" + name + "', '" + surname + "', " + age + ", " + groupid + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
