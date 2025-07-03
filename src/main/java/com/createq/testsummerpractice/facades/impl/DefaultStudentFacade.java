package com.createq.testsummerpractice.facades.impl;

import com.createq.testsummerpractice.converter.StudentConverter;
import com.createq.testsummerpractice.dto.StudentDTO;
import com.createq.testsummerpractice.facades.StudentFacade;
import com.createq.testsummerpractice.model.StudentModel;
import com.createq.testsummerpractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultStudentFacade implements StudentFacade {
    private final StudentService studentService;
    private final StudentConverter studentConverter;

    @Autowired
    public DefaultStudentFacade(StudentService studentService, StudentConverter studentConverter) {
        this.studentService = studentService;
        this.studentConverter = studentConverter;
    }

    @Override
    public List<StudentDTO> getAll(){
        List<StudentModel> models = studentService.getAll();
        return studentConverter.convertAll(models);
    }
}
