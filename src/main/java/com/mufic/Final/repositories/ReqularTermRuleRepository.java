package com.mufic.Final.repositories;

import com.mufic.Final.domain.RegularTermRules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ReqularTermRuleRepository extends JpaRepository<RegularTermRules, Long> {
}
