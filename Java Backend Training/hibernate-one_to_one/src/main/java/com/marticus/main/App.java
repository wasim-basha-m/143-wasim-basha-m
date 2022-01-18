package com.marticus.main;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.Address;
import com.marticus.dao.Student1;
import com.marticus.util.HibernateUtil;

public class App {
	 

		public static void main(String[] args) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");
				Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000");
				Student1 student1 = new Student1("Eswar", address1);
				Student1 student2 = new Student1("Joe", address2);
				session.save(student1);
				session.save(student2);
				transaction.commit();
			} catch (HibernateException e) {
				transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}

		}

	}
 
