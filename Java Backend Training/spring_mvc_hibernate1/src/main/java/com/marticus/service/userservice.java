package com.marticus.service;

import java.util.List;

import com.marticus.Dao.*;
import com.marticus.model.*;

public class userservice {
	private UserDao userDao;
	
	//Create of CRUD
	 public void addUser() {
		 Users users=new Users();
//		 userDao.addUser(users);
		 }
	 
	 //Read of CRUD
	public List<Users> getAllUsers() {
		
		return userDao.getAllUsers();
	}
	
	public Users findUserByEmail(String emailId)
	{
		return userDao.findUserByEmail(emailId);
		
	}

	//Read of CRUD
	    public Users getUserById(int userid) {
	    	return userDao.getUserById(userid);
	    }
	    
	  //Update of CRUD
	    public void updateUser(Users users) {
	    	userDao.updateUser(users);
	    }

	    //Delete of CRUD
	    public void deleteUser(int userid) {
	    	userDao.deleteUser(userid);
	    }

		public UserDao getUserDao() {
			return userDao;
		}

		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}
		
		//Read of CRUD
		public List<Users> findUserByFirstName(String name) {
			return userDao.findUserByFirstName(name);
		}

		public void listOnProjection() {
			 userDao.listOnProjection();
		}

		public void getUserByMaxAge() {
			 userDao.getUserByMaxAge();
		}


}
