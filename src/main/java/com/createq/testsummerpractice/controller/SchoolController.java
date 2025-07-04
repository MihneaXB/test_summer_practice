package com.createq.testsummerpractice.controller;

import com.createq.testsummerpractice.dto.SchoolDTO;
import com.createq.testsummerpractice.facades.SchoolFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SchoolController {
    private final SchoolFacade schoolFacade;

    @Autowired
    public SchoolController(SchoolFacade facade) {
        this.schoolFacade = facade;
    }

    @GetMapping("schools")
    public String getAll(Model model) {
        List<SchoolDTO> schoolsDTOList = schoolFacade.getAll();
        model.addAttribute("allSchools", schoolsDTOList);
        return "allSchools";
    }
}

