package com.marticus.train1;

public class bookprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		b1.setName("java");
		System.out.println("book Name : "+b1.getName());
		b1.setPages(100);
		System.out.println("pages : "+b1.getPages());
		System.out.println("price : "+b1.getPrice());
	}

}
