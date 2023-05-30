package com.example.demo.grade;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Grade {

    @Id
    private Integer id;

    private Integer score;

    public Grade() {
    }

    public Grade(Integer id, Integer score) {
        this.id = id;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
