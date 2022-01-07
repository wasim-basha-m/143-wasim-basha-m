package com.marticus.datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class intrface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> date = new ArrayList<Integer>();
		
		date.add(24);
		date.add(25);
		date.add(26);
		date.add(27);
		
		for(Integer dates:date)
		{
//			System.out.println("No="+date);
			
			
		}
		
		date.remove(2);
		System.out.println("-----");
		for(Integer dates:date)
		{
			//System.out.println("Name="+name);
			
			
		}
		
		Iterator<Integer> it=date.iterator();
		
		while(it.hasNext())
		{
			System.out.println("No :"+ it.next());
		}				
	}

}
