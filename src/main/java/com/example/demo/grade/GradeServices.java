package com.example.demo.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeServices {

    private final GradeRepository gradeRepository;

    @Autowired
    public GradeServices(GradeRepository gradeRepository){
        this.gradeRepository = gradeRepository;
    }


    public void newGrades(Integer studentGrade) {

    }
}
