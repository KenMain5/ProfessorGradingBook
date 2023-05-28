package com.example.demo.studentAndCourseInfo;

import com.example.demo.course.Course;
import com.example.demo.student.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentAndCourseInfo {

    @Id
    private int id;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Student student;


}
