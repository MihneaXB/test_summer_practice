package com.createq.testsummerpractice.service.impl;

import com.createq.testsummerpractice.model.StudentModel;
import com.createq.testsummerpractice.repository.StudentRepository;
import com.createq.testsummerpractice.service.StudentService;

import java.util.List;

public class DefaultStudentService implements StudentService {
    private final StudentRepository studentRepository;

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public DefaultStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentModel> getAll(){
        return studentRepository.findAll();
    }
}
