package com.collabera.AccountManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.AccountManagement.Entity.BillerProvider;
import com.collabera.AccountManagement.Entity.BillerStatement;

@Repository
public interface StatementRepository extends JpaRepository<BillerStatement, Long> {
	
}
