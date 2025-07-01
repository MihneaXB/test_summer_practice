package com.createq.testsummerpractice.repository.impl;

import com.createq.testsummerpractice.model.SchoolModel;
import com.createq.testsummerpractice.model.StudentModel;
import com.createq.testsummerpractice.repository.SchoolRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultSchoolRepository implements SchoolRepository {
    @Override
    public List<SchoolModel> getAll() {
        List<SchoolModel> schools = new ArrayList<>();

        for(int i=1; i<=3; ++i){
            SchoolModel school = new SchoolModel();
            school.setId(i);
            school.setName("School " + i);

            StudentModel student1 = new StudentModel();
            student1.setId(i * 10 + 1);
            student1.setName("Student1_ " + i);
            student1.setAge(20+1);
            student1.setSchool(school);

            StudentModel student2 = new StudentModel();
            student2.setId(i * 10 + 2);
            student2.setName("Student2_ " + i);
            student2.setAge(21+2);
            student2.setSchool(school);

            school.setStudent(Arrays.asList(student1, student2));
            schools.add(school);
        }
        return schools;
    }
}
