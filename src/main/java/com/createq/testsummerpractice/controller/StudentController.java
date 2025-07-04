package com.createq.testsummerpractice.controller;

import com.createq.testsummerpractice.dto.StudentDTO;
import com.createq.testsummerpractice.facades.StudentFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    private final StudentFacade studentFacade;

    @Autowired
    public StudentController(StudentFacade studentFacade) {
        this.studentFacade = studentFacade;
    }

    @GetMapping("students")
    public String getAll(Model model) {
        List<StudentDTO> studentsDTOList = studentFacade.getAll();
        model.addAttribute("allStudents", studentsDTOList);
        return "allStudents";
    }
}
