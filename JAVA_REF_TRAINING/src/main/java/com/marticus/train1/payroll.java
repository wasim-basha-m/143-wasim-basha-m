package com.marticus.train1;

public class payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fulltimeemp f1=new fulltimeemp ();
		f1.setName("wasim");
		f1.setHourlyRate(100);
		f1.setWorkinghours(9);
		double d=f1.payroll();
		System.out.println(d);
		
		
		contractoremp c1=new contractoremp();
		c1.setName("basha");
		c1.setHourlyRate(100);
		c1.setWorkinghours(9);
		double g=f1.payroll();
		System.out.println(g);
	}

}
