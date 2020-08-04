package com.mufic.Final.repositories;

import com.mufic.Final.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
