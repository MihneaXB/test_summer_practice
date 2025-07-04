package com.createq.testsummerpractice.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SchoolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
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