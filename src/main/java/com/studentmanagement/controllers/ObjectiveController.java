package com.studentmanagement.controllers;

import com.studentmanagement.models.Objective;
import com.studentmanagement.services.impl.ObjectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ObjectiveController {
    @Autowired
    private ObjectiveService objectiveService;
    @GetMapping("/objective")
    public ResponseEntity<List<Objective>> getList(){
        List<Objective> objectives = (List<Objective>) objectiveService.findAll();
        return  new ResponseEntity<>(objectives, HttpStatus.OK);
    }

    @PostMapping(value = "/objective/create", produces = { "application/json" }, consumes = { "application/json" })
    public ResponseEntity<Void> addObjective(@RequestBody Objective objective){
        objectiveService.save(objective);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/objective/{id}")
    public ResponseEntity<Void> deleteObjective(@PathVariable Long id){
        objectiveService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/objective/update")
    public ResponseEntity<Objective> updateObjective(@RequestBody Objective objective){
        objectiveService.save(objective);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
