package com.example.demo.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignmentServices {

    private final AssignmentRepository assignmentRepository;

    @Autowired
    public AssignmentServices(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }
    public void newAssignments(Assignment assignments) {
        assignmentRepository.save(assignments);
        //Add logic.. if date added is before the current time.. deny request..
    }

    public Optional<List<Assignment>> getAssignments() {


        return null;
    }
}
