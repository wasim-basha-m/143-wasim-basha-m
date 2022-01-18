package com.howtodoinjava.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.dao.CompanyDAO;
import com.howtodoinjava.demo.model.CompanyVO;

@Service  // else u can also use @Component
@Scope("singleton")
public class CompanyManagerImpl implements CompanyManager {

	@Autowired
	CompanyDAO companydao;

	public CompanyDAO getCompanydao() {
		return companydao;
	}

	public void setCompanydao(CompanyDAO companydao) {
		this.companydao = companydao;
	}
	@Override
	public List<CompanyVO> getAllCompanyNames() {
		// TODO Auto-generated method stub
		return companydao.getAllCompanyNames();
	}

	
	

}
	
	