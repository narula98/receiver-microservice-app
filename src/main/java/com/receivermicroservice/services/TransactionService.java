package com.receivermicroservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.receivermicroservice.entities.Transaction;
import com.receivermicroservice.repositories.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepository;

	public ResponseEntity<Transaction> receieveTransaction(Transaction t) {
		return null;
		
	}

}