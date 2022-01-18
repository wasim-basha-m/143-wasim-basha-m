package com.marticus.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.Books;
//import com.marticus.dao.Company;
import com.marticus.dao.Course;
//import com.marticus.dao.Employee;
import com.marticus.dao.Library;
import com.marticus.dao.M2MEx3Student;
import com.marticus.util.HibernateUtil;

public class M2MT {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
//
			Set<Course> courses = new HashSet<Course>();
			courses.add(new Course("Maths"));
			courses.add(new Course("Computer Science"));

			M2MEx3Student student1 = new M2MEx3Student("Eswar", courses);
			M2MEx3Student student2 = new M2MEx3Student("Joe", courses);
			session.save(student1);
			session.save(student2);
//			
//			M2MEx3Student student11 = new M2MEx3Student();
//			student11.setStudentId(1);
//			session.load(student11, new Long(1));
//			//student11.getCourses();

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

}
}

 
