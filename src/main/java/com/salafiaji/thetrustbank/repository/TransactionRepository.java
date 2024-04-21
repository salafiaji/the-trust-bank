package com.salafiaji.thetrustbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salafiaji.thetrustbank.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
