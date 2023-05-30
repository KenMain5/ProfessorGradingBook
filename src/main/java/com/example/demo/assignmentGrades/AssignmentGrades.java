package com.example.demo.assignmentGrades;

import com.example.demo.assignment.Assignment;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AssignmentGrades {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Assignment assignment;

    public AssignmentGrades() {
    }
    public AssignmentGrades(Integer id, Assignment assignment) {
        this.id = id;
        this.assignment = assignment;
    }
}
