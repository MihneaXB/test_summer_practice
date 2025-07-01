package com.createq.testsummerpractice.repository.impl;

import com.createq.testsummerpractice.model.SchoolModel;
import com.createq.testsummerpractice.model.StudentModel;
import com.createq.testsummerpractice.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class DefaultStudentRepository implements StudentRepository {
    @Override
    public List<StudentModel> getAll(){
        List<StudentModel> students = new ArrayList<>();
        SchoolModel school = new SchoolModel();
        school.setId(1);
        school.setName("AC iasi");

        for(int i=1; i<=3; ++i){
            StudentModel student = new StudentModel();
            student.setId(i);
            student.setName("Mihnea" + i);
            student.setAge(20 + i);
            student.setSchool(school);
            students.add(student);
        }
        return students;
    }
}
