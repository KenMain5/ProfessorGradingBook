package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "v1/students")
public class StudentController {

    private final StudentServices studentServices;

    @Autowired
    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping()
    public List<Student> showStudents(){
        return studentServices.getStudents();
    }

    @PostMapping("/register")
    public void registerNewStudent(@RequestBody Student student){
        studentServices.addNewStudent(student);

    }

    @DeleteMapping(path = "{StudentId}")
    public void deleteStudent(@PathVariable long StudentId) {
        studentServices.terminateStudent(StudentId);
    }


}
