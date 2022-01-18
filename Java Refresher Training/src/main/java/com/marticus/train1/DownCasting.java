package com.marticus.train1;


public class DownCasting {
	
	
	
	  public static void main(String[] args) 
	  { 
	     Parent o = new Child(); // Super class reference refers to sub class object. 
	     Child t = (Child)o; // Converting super class reference type into sub class reference type. 
	      t.m1(); // Calling m1 method using reference variable of sub class. 
	      t.m2(); // Calling m1 method using reference variable of sub class. 
	   } 
	  
	 
	  
	  
	
}
