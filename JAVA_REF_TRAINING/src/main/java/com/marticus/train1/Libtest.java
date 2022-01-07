package com.marticus.train1;

public class Libtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l1=new Library();
		l1.setNumbooks(20);;
		l1.getNumbooks();
		int books=l1.returnbooks();
		System.out.println(l1.getNumbooks());
		int books1=l1.lendbooks();
		System.out.println(l1.getNumbooks());
		
	}

}
