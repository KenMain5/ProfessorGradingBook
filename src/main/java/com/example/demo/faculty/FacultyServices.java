package com.example.demo.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServices {

    final private FacultyRepository facultyRepository;

    @Autowired
    public FacultyServices(FacultyRepository facultyRepository){
        this.facultyRepository = facultyRepository;
    }

    public void newFaculty(Faculty faculty) {
        Optional<Faculty> optionalFaculty =
                facultyRepository.findByCode(faculty.getCode());
        if (optionalFaculty.isPresent()) {
            throw new IllegalStateException("the faculty member already exists");
        }
        else {
            facultyRepository.save(faculty);
        }
    }


    public List<Faculty> searchAllFaculty() {
        return facultyRepository.findAll();

    }
}
