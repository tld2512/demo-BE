package com.studentmanagement.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Objective {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String image;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "syllabus_id")
    private Syllabus syllabus;

    @JsonManagedReference
    @OneToMany(mappedBy = "objective", fetch = FetchType.EAGER)
    private List<Skill> skillList;

    public Objective() {
    }
}
