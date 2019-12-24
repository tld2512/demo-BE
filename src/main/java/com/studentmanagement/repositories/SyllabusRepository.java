package com.studentmanagement.repositories;

import com.studentmanagement.models.Syllabus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SyllabusRepository extends JpaRepository<Syllabus, Long> {
}
