package com.mufic.Final.repositories;

import com.mufic.Final.model.CourseInTerm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CourseInTermRepository extends JpaRepository<CourseInTerm, Long> {
}
