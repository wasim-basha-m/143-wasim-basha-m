package com.collabera.AccountManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.AccountManagement.Entity.BillerProvider;

@Repository
public interface ProviderRepository extends JpaRepository<BillerProvider, Long> {

	BillerProvider findBillerProviderById(long id);

	
}
