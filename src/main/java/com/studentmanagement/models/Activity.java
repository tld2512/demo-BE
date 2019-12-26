package com.studentmanagement.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER)
    private List<Skill> skillList;

    public Activity() {
    }
}
