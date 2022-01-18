package com.marticus.datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hassetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> room=new HashMap<Integer,String>();
		room.put(01,"wasim");
		room.put(02,"wahid");
		room.put(03,"thufail");
		room.put(04,"aiza");
		
		String r=room.get(01);
		System.out.println(01);

		if(room.isEmpty())
		{
		System.out.println("no roll num found ");
		}
		else
		{
			System.out.println("there are students");
		}

//		 Set<Entry<Integer, String>> room1 = room1.entrySet(); 
			
		  
////		    Iterator<Map.Entry<Integer, String>> room1Iterator = room1.iterator();
//		    
//		    while (room1Iterator.hasNext()) {
//	            Map.Entry<Integer, String> entry = room1Iterator.next();
//	            System.out.println(entry.getKey() + " => " + entry.getValue());

		    }
	}
//}
