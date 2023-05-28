package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServices(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }


    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }

    public void trialFindStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByName(student.getName());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("name already taken");
        }
        studentRepository.save(student);
    }


    public void terminateStudent(Long StudentId) {
        boolean exist = studentRepository.existsById(StudentId);
        if (!exist) {
            throw new IllegalStateException("Student does not exist");
        }
        else {
            studentRepository.deleteById(StudentId);
        }



    }
}
