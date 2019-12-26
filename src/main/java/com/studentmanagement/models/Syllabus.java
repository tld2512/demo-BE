package com.studentmanagement.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.File;
import java.util.List;

@Entity
@Data
public class Syllabus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private File image;
    private String description;

    @JsonManagedReference
    @OneToMany(mappedBy = "syllabus", fetch = FetchType.EAGER)
    private List<Objective> objectiveList;

    public Syllabus() {
    }

}
