package com.marticus.train1;

public class thrwclass2 {

	public static void main(String args[])
	{
		thrwclass<String> d1 = new thrwclass<String>();
		d1.set("wasim");
		System.out.println(d1.get());
		
		thrwclass<Integer> d11 = new thrwclass<Integer>();
		d11.set(14);
		System.out.println(d11.get());
		
		thrwclass1<String,Integer> d12 = new thrwclass1<String,Integer>("wasim",25);
		
		
	}
	 
	
	
}
