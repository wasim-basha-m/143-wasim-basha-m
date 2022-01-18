package com.javabydeveloper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Teacher;

/**
 * JPA Hello world!
 *
 */
public class TeacherApp {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			emf = Persistence.createEntityManagerFactory("jbd-pu");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			Teacher teacher = new Teacher();
			teacher.setName("wasim");
			teacher.setPhysics("chapter1");
			teacher.setMsc("nochapter");
			

			entityManager.persist(teacher);

			transaction.commit();
		
			Query q = entityManager.createQuery("select a from Tea a");

			List<Teacher> resultList = q.getResultList();
			System.out.println("num of Teachers:" + resultList.size());
			for (Teacher next : resultList) {
				System.out.println("next Teacher: " + next);
			}

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {
			entityManager.close();
			emf.close();
		}
	}
}
