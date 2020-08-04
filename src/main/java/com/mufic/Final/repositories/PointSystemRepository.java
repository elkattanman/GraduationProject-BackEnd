package com.mufic.Final.repositories;

import com.mufic.Final.model.PointSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
public interface PointSystemRepository extends JpaRepository<PointSystem, Long> {
}
