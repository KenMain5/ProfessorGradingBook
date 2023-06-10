package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "v1/students")
public class StudentController {


    private final StudentServices studentServices;

    @Autowired
    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping()
    @ResponseBody
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

    @GetMapping("/Experimental")
    public String experimental(Model model){
        List<Student> studentList = studentServices.getStudents();
        model.addAttribute("students", studentList);
        return "student";
    }
}
