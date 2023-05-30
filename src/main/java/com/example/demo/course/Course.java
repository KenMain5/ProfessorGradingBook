package com.example.demo.course;

import com.example.demo.assignment.Assignment;
import com.example.demo.student.Student;
import com.example.demo.studentAndCourseInfo.StudentAndCourseInfo;
import jakarta.persistence.*;

import java.util.*;


@Entity
public class Course {

    @Id
    @GeneratedValue
    private Integer cid; //course ID

    @OneToMany(mappedBy = "course")
    private Set<StudentAndCourseInfo> students = new HashSet<>();

    @OneToMany(mappedBy = "course")
    private List<Assignment> assignments = new ArrayList<>();

    public Course() {
    }

    public Course(Integer cid, Set<StudentAndCourseInfo> students, List<Assignment> assignments) {
        this.cid = cid;
        this.students = students;
        this.assignments = assignments;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Set<StudentAndCourseInfo> getStudents() {
        return students;
    }

    public void setStudents(Set<StudentAndCourseInfo> students) {
        this.students = students;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    //(targetEntity = Student.course, cascade = CascadeType.ALL)
    //private Set<Student> students;
    //private Integer grade;



}
