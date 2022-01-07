package com.marticus.train1;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Please enter a text");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		boolean b=isPalindrome(str);
		
		if(b==true)
		{
			System.out.println(str + " is Palindrome");
			
		}else
		{
			System.out.println(str + " is not a Palindrome");
		}
		
		
	}
	
	 
    static boolean isPalindrome(String str)
    {
    	//check if str is palindrome then return true else return false
    	String i=null;
    	while(i!=str) {
  
    	}
    	return false;
    }
}


