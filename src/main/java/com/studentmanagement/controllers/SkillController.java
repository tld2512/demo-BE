package com.studentmanagement.controllers;

import com.studentmanagement.models.Skill;
import com.studentmanagement.services.impl.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class SkillController {
    @Autowired
    private SkillService skillService;
    @GetMapping("/skill")
    public ResponseEntity<List<Skill>> getList(){
        List<Skill> skills = (List<Skill>) skillService.findAll();
        return  new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PostMapping("/skill/create")
    public ResponseEntity<Void> addSkill(@RequestBody Skill skill){
        skillService.save(skill);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/skill/{id}")
    public ResponseEntity<Void> deleteSkill(@PathVariable Long id){
        skillService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/skill/update")
    public ResponseEntity<Skill> updateSkill(@RequestBody Skill skill){
        skillService.save(skill);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
