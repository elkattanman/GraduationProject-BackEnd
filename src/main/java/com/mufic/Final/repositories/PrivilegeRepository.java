package com.mufic.Final.repositories;

import com.mufic.Final.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
}
