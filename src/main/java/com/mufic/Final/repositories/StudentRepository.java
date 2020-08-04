package com.mufic.Final.repositories;

import com.mufic.Final.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface StudentRepository extends JpaRepository<Student, Long> {

//    @RestResource(path = "username")
    Student findByUserUsername(String username);
}
