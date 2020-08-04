package com.mufic.Final.repositories;

import com.mufic.Final.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface SummerTermRulesRepository extends JpaRepository<SummerTermRules, PointKey> {
}
