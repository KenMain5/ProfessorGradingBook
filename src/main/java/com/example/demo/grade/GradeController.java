package com.example.demo.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/courses/assignment/Grades")
public class GradeController {

    private final GradeServices gradeServices;

    @Autowired
    public GradeController(GradeServices gradeServices) {
        this.gradeServices = gradeServices;
    }

    @PostMapping("/addGrades")
    public void addGrades(@RequestBody Integer student_grade){
        gradeServices.newGrades(student_grade);
    }


}
