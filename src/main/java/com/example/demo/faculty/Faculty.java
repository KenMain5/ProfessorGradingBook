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
    private Integer f_id;

    private String firstName;

    private String code;

    @OneToMany(mappedBy = "faculty")
    private Set<Student> students = new HashSet();

    public Faculty() {
    }

    public Faculty(Integer f_id, String firstName, String code, Set<Student> students) {
        this.f_id = f_id;
        this.firstName = firstName;
        this.code = code;
        this.students = students;
    }

    public Integer getF_id() {
        return f_id;
    }

    public void setF_id(Integer f_id) {
        this.f_id = f_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
