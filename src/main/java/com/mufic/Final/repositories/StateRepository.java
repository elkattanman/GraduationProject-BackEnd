package com.mufic.Final.repositories;

import com.mufic.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface StateRepository extends JpaRepository<State, Long> {
}
