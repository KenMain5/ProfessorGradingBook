package com.example.demo.faculty;

import com.example.demo.student.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private int f_id;

    @OneToMany(mappedBy = "faculty")
    private Set<Student> students = new HashSet();


}
