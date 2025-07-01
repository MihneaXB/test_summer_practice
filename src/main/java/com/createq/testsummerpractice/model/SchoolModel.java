package com.createq.testsummerpractice.model;

import java.util.List;

public class SchoolModel {
    private int id;
    private String name;
    List<StudentModel> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentModel> getStudent(int id) {
        return students;
    }

    public void setStudent(List<StudentModel> students) {
        this.students = students;
    }
}
