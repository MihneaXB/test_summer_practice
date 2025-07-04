package com.createq.testsummerpractice.service.impl;

import com.createq.testsummerpractice.model.SchoolModel;
import com.createq.testsummerpractice.repository.SchoolRepository;
import com.createq.testsummerpractice.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;
=======
>>>>>>> day3
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSchoolService implements SchoolService {
    private final SchoolRepository schoolRepository;

    public SchoolRepository getSchoolRepository() {
        return schoolRepository;
    }

    @Autowired
    public  DefaultSchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<SchoolModel> getAll(){
        return schoolRepository.findAll();
    }
}
