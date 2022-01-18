package com.marticus.ReservationAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class HotelAspect{
	@Before("execution(* com.marticus.ReservationImpl.ReservationImpl.checkIn(..))")
	public void checkId(JoinPoint joinPoint) {
		System.out.println("Checking Id");
		System.out.println("Checking Vaccination");
    }
	@After("execution(* com.marticus.ReservationImpl.ReservationImpl.checkOut(..))")
	public void checkVaccCert(JoinPoint joinpoint) {
		System.out.println("Checked In");
		System.out.println("Room status Checked...");
	}
	@Around("execution(* com.marticus.ReservationImpl.ReservationImpl.checkOut(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		//System.out.println("Checked Out");
		joinPoint.proceed();
		System.out.println("Checked Out");
		
		}
	
}