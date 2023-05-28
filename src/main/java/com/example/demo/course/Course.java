package com.example.demo.course;

import com.example.demo.student.Student;
import com.example.demo.studentAndCourseInfo.StudentAndCourseInfo;
import jakarta.persistence.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Course {

    @Id
    @GeneratedValue
    private int cid; //course ID

    @OneToMany(mappedBy = "course")
    private Set<StudentAndCourseInfo> students = new HashSet<>();

    //(targetEntity = Student.course, cascade = CascadeType.ALL)
    //private Set<Student> students;
    //private Integer grade;



}
