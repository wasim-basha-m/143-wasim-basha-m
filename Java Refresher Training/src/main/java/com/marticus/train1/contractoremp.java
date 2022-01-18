package com.marticus.train1;

public class contractoremp extends Employee{
int workinghours;
double HourlyRate;



public int getWorkinghours() {
	return workinghours;
}



public void setWorkinghours(int workinghours) {
	this.workinghours = workinghours;
}



double payroll() {
	double salary=(workinghours)*(this.getHourlyRate())*2;
	return salary;
}
}