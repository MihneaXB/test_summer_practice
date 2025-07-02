package com.createq.testsummerpractice.repository;

import com.createq.testsummerpractice.model.SchoolModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<SchoolModel, Long> {

}
