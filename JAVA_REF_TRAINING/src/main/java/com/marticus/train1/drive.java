package com.marticus.train1;

public class drive {

	String h,t;
	void display()
	{
		System.out.println("user is driving hyundai car : "+h);
		System.out.println("user is driving hyundai car : "+t);	
	}
	
}

class hyundai extends drive
{
	String y;
	
{
	
	System.out.println("hyundai car"+y);
}
}
class tata extends drive
{
	String a;
	
{
	
	System.out.println("tata car"+a);
}
}
class vehicle
{
	public static void main(String args[])
	{
		hyundai h1=new hyundai();
		h1.display();
		tata t1=new tata();
		t1.display();
	}

	}