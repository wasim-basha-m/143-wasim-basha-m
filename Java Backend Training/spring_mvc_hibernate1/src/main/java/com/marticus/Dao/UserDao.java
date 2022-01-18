package com.marticus.Dao;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.marticus.model.Users;
import com.marticus.utility.HibernateUtil;

public class UserDao {

	//Create of CRUD
	 public void addUser() {
		 	Users users=new Users();
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            session.save(users);
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
//	      return "home.jsp";
	    }
	 
	 //Read of CRUD
	@SuppressWarnings("unchecked")
	public List<Users> getAllUsers() {
	        List<Users> users = new ArrayList<Users>();
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            users = session.createQuery("from User").getResultList();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return users;
	    }
	 
	 //Read of CRUD
	@SuppressWarnings("unchecked")
	public List<Users> findUserByFirstName(String name) {
	        List<Users> users = new ArrayList<Users>();
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	        	 //Hibernate Named Query    
	            TypedQuery<Users> query = session.getNamedQuery("findUserByFirstName");    
	             query.setParameter("firstName",name);   
	             
	                     
	             users=query.getResultList();   
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return users;
	    }

	//Read of CRUD
	    public Users getUserById(int userid) {
	        Users users = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            String hqlQuery = "from User where id = :id";
	            @SuppressWarnings("rawtypes")
				Query query = session.createQuery(hqlQuery);
	            query.setParameter("id", userid);
	            users = (Users) query.getSingleResult();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return users;
	    }
	    
	    public Users findUserByEmail(String emailId) {
	        Users users = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            String hqlQuery = "from User where email = :email";
	            @SuppressWarnings("rawtypes")
				Query query = session.createQuery(hqlQuery);
	            query.setParameter("email", emailId);
	            users = (Users) query.getSingleResult();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return users;
	    }
	    
	  //Update of CRUD
	    public void updateUser(Users users) {
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            session.update(users);
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	    }

	    //Delete of CRUD
	    public void deleteUser(int userid) {
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            Users users = (Users) session.load(Users.class, new Integer(userid));
	            session.delete(users);
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	    }

		@SuppressWarnings({ "unchecked", "deprecation" })
		public void listOnProjection() {
			List<?> user = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	        	Criteria criteria = session.createCriteria(Users.class); 
	        	Projection projection = Projections.property("firstName"); 
	        	Projection projection2 = Projections.property("lastName"); 
	        	Projection projection3 = Projections.property("email"); 
	        	ProjectionList pList = Projections.projectionList(); 
	        	pList.add(projection); 
	        	pList.add(projection2); 
	        	pList.add(projection3); 
	        	criteria.setProjection(pList); 
	        	user = criteria.list();
	        	
	        	Iterator<?> it2 = user.iterator();

	            while (it2.hasNext()) {
	                Object[] obj = (Object[]) it2.next();
	                System.out.println("firstName : " + obj[0]+" lastName : "+obj[1]+" email : "+obj[2]);
	            }
	            
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	    }

		//Read of CRUD
		    public void getUserByMaxAge() {
		        Session session = HibernateUtil.getSessionFactory().openSession();
		        try {
		            String hqlQuery = "SELECT SUM(age) FROM User ";
		            @SuppressWarnings("rawtypes")
					Query query = session.createQuery(hqlQuery);
		            Object maxAge = query.getSingleResult();
		            
		            System.out.println("Maximum age of User -> " + maxAge);
		            
		        } catch (RuntimeException e) {
		            e.printStackTrace();
		        } finally {
		            session.close();
		        }
		    }

	
}
