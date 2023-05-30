package com.example.demo.faculty;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Faculty")
public class FacultyController {

    final private FacultyServices facultyServices;

    public FacultyController(FacultyServices facultyServices){
        this.facultyServices = facultyServices;
    }



    //@GetMapping()
    //public void
    //search faculty/professor
    @PostMapping("/add")
    public void addFaculty(@RequestBody Faculty faculty){
        facultyServices.newFaculty(faculty);
    }

    @GetMapping
    public List<Faculty> findAllFaculty(){
        return facultyServices.searchAllFaculty();
    }


}
