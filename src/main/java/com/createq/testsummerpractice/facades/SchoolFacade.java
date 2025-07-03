package com.createq.testsummerpractice.facades;

import com.createq.testsummerpractice.dto.SchoolDTO;
import com.createq.testsummerpractice.model.SchoolModel;

import java.util.List;

public interface SchoolFacade {
    List<SchoolDTO> getAll();
}
