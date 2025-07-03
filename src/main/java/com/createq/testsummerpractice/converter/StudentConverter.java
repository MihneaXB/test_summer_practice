package com.createq.testsummerpractice.converter;

import com.createq.testsummerpractice.dto.StudentDTO;
import com.createq.testsummerpractice.model.StudentModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentConverter {
    public StudentDTO converter(StudentModel studentModel) {
        if (studentModel == null) return null;
        StudentDTO dto = new StudentDTO();
        dto.setId(studentModel.getId());
        dto.setName(studentModel.getName());
        return dto;
    }

    public List<StudentDTO> convertAll(List<StudentModel> studentsModel) {
        return studentsModel.stream().map(this::converter).collect(Collectors.toList());
    }
}
