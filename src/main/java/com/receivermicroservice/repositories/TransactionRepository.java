package com.receivermicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.receivermicroservice.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
