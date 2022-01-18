package com.marticus.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marticus.ReservationAspect.HotelAspect;
import com.marticus.ReservationImpl.ReservationImpl;
import com.marticus.auth.Authenticate;


public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext appContext1 = new ClassPathXmlApplicationContext("Spring-Customer.xml");
//
//		ReservationImpl reserve = (ReservationImpl) appContext.getBean("reservation");
//		reserve.CheckIn();
		Authenticate auth = appContext1.getBean(Authenticate.class);
		auth.CheckIn();
		auth.CheckOut();
		ReservationImpl reserve = appContext1.getBean(ReservationImpl.class);
		reserve.CheckIn();
		reserve.CheckOut();
		HotelAspect hotel = appContext1.getBean(HotelAspect.class);
		hotel.checkId(null);
		hotel.checkVaccCert(null);
		
	
	}
}