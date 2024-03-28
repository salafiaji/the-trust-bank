package com.salafiaji.thetrustbank.repository;


import com.salafiaji.thetrustbank.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Boolean existsByEmail(String email);
    Boolean existsByAccountNumber(String accountNumber);
    Users findByAccountNumber(String accountNumber);
}
