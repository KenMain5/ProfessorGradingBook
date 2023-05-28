package com.example.demo.student;


import com.example.demo.course.Course;
import com.example.demo.faculty.Faculty;
import com.example.demo.studentAndCourseInfo.StudentAndCourseInfo;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private LocalDate dob;
    private String email;
    @ManyToOne
    private Faculty faculty;

    @OneToMany(mappedBy = "student")
    private Set<StudentAndCourseInfo> coursesInfo = new HashSet<>();

    //his ID, name, email, dob, age,
    //mine id, name, age, dob ,email

    public Student() {
    }

    public Student(Long id, String name, Integer age, LocalDate dob, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }



    public Student(String name, Integer age, LocalDate dob, String email) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
