package com.studentmanagement.repositories;

import com.studentmanagement.models.Objective;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjectiveRepository extends JpaRepository<Objective, Long> {
}
