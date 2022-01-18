package com.marticus.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.marticus.ReservationImpl.ReservationImpl;
import com.marticus.bo.Reservation.Reservation;


@Configuration
	public class AppConfig
	{
	@Bean
	public ReservationImpl getid(){
		return new ReservationImpl();
	}
	
 }
