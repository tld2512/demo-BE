package com.studentmanagement.controllers;

import com.studentmanagement.models.Syllabus;
import com.studentmanagement.services.impl.SyllabusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class SyllabusController {
    @Autowired
    private SyllabusService syllabusService;
    @GetMapping("/syllabus")
    public ResponseEntity<List<Syllabus>> getList(){
        List<Syllabus> syllabusList = (List<Syllabus>) syllabusService.findAll();
        return  new ResponseEntity<>(syllabusList, HttpStatus.OK);
    }

    @PostMapping("/syllabus/create")
    public ResponseEntity<Void> addSyllabus(@RequestBody Syllabus syllabus){
        syllabusService.save(syllabus);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/syllabus/{id}")
    public ResponseEntity<Void> deleteSyllabus(@PathVariable Long id){
        syllabusService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/syllabus/update")
    public ResponseEntity<Syllabus> updateSyllabus(@RequestBody Syllabus syllabus){
        syllabusService.save(syllabus);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
