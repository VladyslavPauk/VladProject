package com.example.VladProject;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int groupId;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, String surname, int age, int groupId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupId = groupId;
    }
    Student (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Name student " + name + " surname " + surname + " age " + age + " in group" + groupId;
    }
}



