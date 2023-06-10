package com.example.demo.assignment;

import com.example.demo.assignmentGrades.AssignmentGrades;
import com.example.demo.course.Course;
import com.example.demo.grade.Grade;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignment {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="assignment_name")
    @Nonnull
    private String assignmentName;

    @Column(name="assignment_dueDate")
    private LocalDateTime dueDate;

    @OneToMany(mappedBy = "assignment")
    private List<AssignmentGrades> assignmentgrade = new ArrayList<>();

    @ManyToOne
    private Course course;

    public Assignment() {
    }

    public Assignment(String assignmentName, LocalDateTime dueDate, Course course) {
        this.assignmentName = assignmentName;
        this.dueDate = dueDate;
        this.course = course;
    }
}
