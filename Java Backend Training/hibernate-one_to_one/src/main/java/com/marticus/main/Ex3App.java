package com.marticus.main;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.CoachingCentre;
import com.marticus.dao.Ex3Student;
import com.marticus.util.HibernateUtil;
import com.marticus.dao.*;
public class Ex3App {
	public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = null;
	try {
	transaction = session.beginTransaction();

	Set<CoachingCentre> coachingcentres = new HashSet<CoachingCentre>();
	coachingcentres.add(new CoachingCentre("LEARNPHY","PHYSICS"));
	coachingcentres.add(new CoachingCentre("MATHSYOGA","MATHS"));
	coachingcentres.add(new CoachingCentre("CHEMLEARN","CHEMISTRY"));

	Ex3Student ex3student = new Ex3Student("wasim",coachingcentres);
	session.save(ex3student);

	transaction.commit();
	} catch (HibernateException e) {
	transaction.rollback();
	e.printStackTrace();
	} finally {
	session.close();
	}

	}

	}
