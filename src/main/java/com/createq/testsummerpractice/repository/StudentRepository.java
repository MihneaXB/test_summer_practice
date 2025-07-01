package com.createq.testsummerpractice.repository;

import com.createq.testsummerpractice.model.StudentModel;

import java.util.ArrayList;
import java.util.List;

public interface StudentRepository {
    List<StudentModel> getAll();
}
