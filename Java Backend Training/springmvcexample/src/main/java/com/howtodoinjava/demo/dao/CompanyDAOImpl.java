package com.howtodoinjava.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.howtodoinjava.demo.model.CompanyVO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.CompanyVO;


@Repository
@Scope("singleton")
public class CompanyDAOImpl implements CompanyDAO {

	@Override
	public List<CompanyVO> getAllCompanyNames() {
		// TODO Auto-generated method stub
		
		List<CompanyVO> companies = new ArrayList<CompanyVO>();
		
		CompanyVO company1=new CompanyVO();
		company1.setCompName("IBM");
		companies.add(company1);
		
		CompanyVO company2=new CompanyVO();
		company2.setCompName("Cognizant");
		companies.add(company2);
		
		CompanyVO company3=new CompanyVO();
		company3.setCompName("TCS");
		companies.add(company3);
		
		return companies;
		
		
	}

}