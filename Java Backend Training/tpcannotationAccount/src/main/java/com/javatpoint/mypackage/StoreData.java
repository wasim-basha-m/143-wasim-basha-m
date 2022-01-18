package com.javatpoint.mypackage;
import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class StoreData {
 
	public static void main(String[] args) {
	
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
//		Employee e1=new Employee();
//		e1.setName("Gaurav Chawla");
		
		Savings s2=new Savings();
		s2.setAccountId("1234");
		s2.setName("faraaz");
		s2.setInterest(90);
		
		Current c3=new Current();
		c3.setAccountId("1235");
		c3.setName("Indhar");
		c3.setOverDraftAmount(100);
		
		//session.persist(e1);
		session.persist(s2);
		session.persist(c3);
		
		t.commit();
		session.close();
		System.out.println("success");
		
		
		
		
	}
}
