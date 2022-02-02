package com.collabera.AccountManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.AccountManagement.Entity.BillerRegister;

@Repository
public interface RegisterRepository extends JpaRepository<BillerRegister, Long>
{

	BillerRegister findBillerRegisterById(long id);

}
