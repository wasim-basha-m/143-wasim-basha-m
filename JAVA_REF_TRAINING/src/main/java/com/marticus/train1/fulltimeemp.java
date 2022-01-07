package com.marticus.train1;

public class fulltimeemp extends Employee{
int workinghours;



public int getWorkinghours() {
	return workinghours;
}



public void setWorkinghours(int workinghours) {
	this.workinghours = workinghours;
}



double payroll() {
	double salary=(workinghours)*(this.getHourlyRate())*2.5;
	return salary;
}
}