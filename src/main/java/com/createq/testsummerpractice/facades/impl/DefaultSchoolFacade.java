package com.createq.testsummerpractice.facades.impl;

import com.createq.testsummerpractice.converter.SchoolConverter;
import com.createq.testsummerpractice.dto.SchoolDTO;
import com.createq.testsummerpractice.facades.SchoolFacade;
import com.createq.testsummerpractice.model.SchoolModel;
import com.createq.testsummerpractice.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultSchoolFacade implements SchoolFacade {
    private final SchoolService schoolService;
    private final SchoolConverter schoolConverter;

    @Autowired
    public DefaultSchoolFacade(SchoolService schoolService, SchoolConverter schoolConverter) {
        this.schoolService = schoolService;
        this.schoolConverter = schoolConverter;
    }

    @Override
    public List<SchoolDTO> getAll(){
        List<SchoolModel> models = schoolService.getAll();
        return schoolConverter.convertAll(models);
    }
}
