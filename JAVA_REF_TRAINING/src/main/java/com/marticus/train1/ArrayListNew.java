package com.marticus.train1;

import java.util.ArrayList;

public class ArrayListNew {

	public static void main(String args[])
	{ 
		ArrayList <User> uList= new ArrayList<User>();
		
		User u= new User("Jayanta",21);
		User u1= new User("Amit",22);
		User u3= new User("Sadhna",25);
		
		uList.add(u);
		uList.add(u1);
		uList.add(u3);
		
	   for(User u11: uList)
	   {
		   System.out.println("Name="+u11.getName());
		   System.out.println("Age="+u11.getAge());
		   
	   }
		
		
		
			
	}
}
