package com.studentmanagement.services.impl;

import com.studentmanagement.models.Syllabus;
import com.studentmanagement.repositories.SyllabusRepository;
import com.studentmanagement.services.ISyllabusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SyllabusService implements ISyllabusService {
    @Autowired
    private SyllabusRepository syllabusRepository;

    @Override
    public Iterable<Syllabus> findAll() {
        return syllabusRepository.findAll();
    }

    @Override
    public Syllabus findById(Long id) {
        return syllabusRepository.findById(id).get();
    }

    @Override
    public void save(Syllabus syllabus) {
        syllabusRepository.save(syllabus);
    }

    @Override
    public void delete(Long id) {
        syllabusRepository.deleteById(id);
    }
}
