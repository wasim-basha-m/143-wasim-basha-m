package com.marticus.train1;

import java.util.Scanner;

public class mularray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int dates[][]={{21,11},{22,11},{23,11},{24,11}};
		
//		int months[][]= {{1,2},{3,4},{5,7}};
//		
//		//System.out.println(months[1][0]);
//		
//		for(int i=0;i<months.length;i++)
//		{
//			int month1[]=months[i];
//			for(int j=0;j<month1.length;j++)
//			{
//				System.out.println(month1[j]);
//			}
//			
//		}
		
		String [] names=new String[3];
		 
		 
		 
		 Scanner sc =new Scanner(System.in);
		 for(int i=0;i<3;i++)
		 {
			 System.out.println("Please enter a name:");
			 names[i]=sc.nextLine();
		 }
		 
		 for(int j=0;j<3;j++)
		 {
			 System.out.println("Entered name:"+names[j]);
			 
		 }
		 
     
	}
	}
	
