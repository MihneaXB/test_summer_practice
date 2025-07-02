package com.createq.testsummerpractice.repository;

import com.createq.testsummerpractice.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}
