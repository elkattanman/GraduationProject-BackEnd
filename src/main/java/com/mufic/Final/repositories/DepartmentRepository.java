package com.mufic.Final.repositories;

import com.mufic.Final.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
