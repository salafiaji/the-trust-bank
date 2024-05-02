package com.salafiaji.thetrustbank.repository;


import com.salafiaji.thetrustbank.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    Boolean existsByEmail(String email);
    Optional<Users> findByEmail(String email);
    Boolean existsByAccountNumber(String accountNumber);
    Users findByAccountNumber(String accountNumber);
}
