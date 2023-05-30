package com.example.demo.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/assignments")
public class AssignmentController {

    private final AssignmentServices assignmentServices;

    @Autowired
    public AssignmentController(AssignmentServices assignmentServices) {
        this.assignmentServices = assignmentServices;
    }

    @PostMapping("/add")
    public void addAssignments(@RequestBody Assignment assignments){
        assignmentServices.newAssignments(assignments);
    }

    @GetMapping("/{course}")
    public Optional<List<Assignment>> showAssignments(){
        return assignmentServices.getAssignments();
    }
}
