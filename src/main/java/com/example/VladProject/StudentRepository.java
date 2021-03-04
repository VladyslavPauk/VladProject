package com.example.VladProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public static List<Student> getAllStudent() {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<Student> studentList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_db", "postgres", "0708");
            Statement statement = connection.createStatement();
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
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return studentList;

    }

    public static Student getStudent(int id) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Student student = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_db", "postgres", "0708");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Student where id = " + id);

            if (resultSet.next()) {
                student = new Student();
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setAge(resultSet.getInt("age"));
                student.setGroupId(resultSet.getInt("groupid"));
                student.setId(resultSet.getInt("id"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return student;
    }
}
