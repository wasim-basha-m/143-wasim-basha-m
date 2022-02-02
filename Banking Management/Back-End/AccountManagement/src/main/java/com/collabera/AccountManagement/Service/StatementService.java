package com.collabera.AccountManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.AccountManagement.Entity.BillerStatement;
import com.collabera.AccountManagement.Repo.StatementRepository;

@Service
public class StatementService {
	
	@Autowired
	StatementRepository statementRepository;

	public List<BillerStatement> listAllBillerStatement() {
		// TODO Auto-generated method stub
		return statementRepository.findAll();
	}

}
