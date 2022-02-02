package com.collabera.AccountManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.AccountManagement.Entity.BillerRegister;
import com.collabera.AccountManagement.Repo.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	RegisterRepository registerRepository;

	public long createNewRegistry(BillerRegister billerRegister) {
		// TODO Auto-generated method stub
		registSerRepository.save(billerRegister);
		return billerRegister.getId();
	}

	public BillerRegister findById(long id) {
		// TODO Auto-generated method stub
		return registerRepository.findBillerRegisterById(id);
	}

}
