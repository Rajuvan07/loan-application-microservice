package com.example.loanservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.loanservice.entity.Loan;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
