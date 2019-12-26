package com.studentmanagement.services.impl;

import com.studentmanagement.models.Objective;
import com.studentmanagement.repositories.ObjectiveRepository;
import com.studentmanagement.services.IObjectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObjectiveService implements IObjectiveService {
    @Autowired
    private ObjectiveRepository objectiveRepository;

    @Override
    public Iterable<Objective> findAll() {
        return objectiveRepository.findAll();
    }

    @Override
    public Objective findById(Long id) {
        return objectiveRepository.findById(id).get();
    }

    @Override
    public void save(Objective objective) {
        objectiveRepository.save(objective);
    }

    @Override
    public void delete(Long id) {
        objectiveRepository.deleteById(id);
    }
}
