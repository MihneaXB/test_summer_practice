package com.createq.testsummerpractice.service.impl;

import com.createq.testsummerpractice.model.SchoolModel;
import com.createq.testsummerpractice.repository.SchoolRepository;
import com.createq.testsummerpractice.service.SchoolService;

import java.util.List;

public class DefaultSchoolService implements SchoolService {
    private final SchoolRepository schoolRepository;

    public SchoolRepository getSchoolRepository() {
        return schoolRepository;
    }

    public  DefaultSchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<SchoolModel> getAll(){
        return schoolRepository.getAll();
    }
}
