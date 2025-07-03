package com.createq.testsummerpractice.converter;

import com.createq.testsummerpractice.dto.SchoolDTO;
import com.createq.testsummerpractice.model.SchoolModel;

import java.util.List;
import java.util.stream.Collectors;

public class SchoolConverter {
    private final StudentConverter studentConverter;

    public SchoolConverter(StudentConverter studentConverter) {
        this.studentConverter = studentConverter;
    }

    public SchoolDTO converter(SchoolModel schoolModel) {
        if (schoolModel == null) return null;

        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(schoolModel.getId());
        schoolDTO.setName(schoolModel.getName());
        schoolDTO.setStudents(studentConverter.convertAll(schoolModel.getStudent(schoolModel.getId())));
        return schoolDTO;
    }

    public List<SchoolDTO> convertAll(List<SchoolModel> schoolsModel){
        return schoolsModel.stream().map(this::converter).collect(Collectors.toList());
    }
}
