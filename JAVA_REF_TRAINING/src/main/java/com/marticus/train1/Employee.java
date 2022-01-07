package com.marticus.train1;

public abstract class Employee {

	private String name;
	public double HourlyRate;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getHourlyRate() {
		return HourlyRate;
	}


	public void setHourlyRate(double hourlyRate) {
		HourlyRate = hourlyRate;
	}


	abstract double payroll();

}
