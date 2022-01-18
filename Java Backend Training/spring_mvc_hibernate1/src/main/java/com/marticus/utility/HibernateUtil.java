package com.marticus.utility;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
//	private static SessionFactory sessionFactory = buildSessionFactory();
//
//	private static SessionFactory buildSessionFactory() 
//	{
//		try 
//		{
//			if (sessionFactory == null) 
//			{
//				StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
//						.configure("hibernate.cfg.xml").build();
//				
//				Metadata metaData = new MetadataSources(standardRegistry)
//						.getMetadataBuilder()
//						.build();
//				
//				sessionFactory = metaData.getSessionFactoryBuilder().build();
//			}
//			return sessionFactory;
//		} catch (Throwable ex) {
//			throw new ExceptionInInitializerError(ex);
//		}
//	}
//
//	public static SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
//
//	public static void shutdown() {
//		getSessionFactory().close();
//	}
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception to track it
            System.err.println("SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static void shutdown() {
    	// Optional but can be used to Close caches and connection pools
    	getSessionFactory().close();
    }

}