package com.marticus;

public class CarRental {

	private Rent rent;

	
 public Rent getRent() {
		return rent;
	}


	public void setRent(Rent rent) {
		this.rent = rent;
	}


public void showRentedCar()
 {
	
	rent.showRentedCar();
	 
 }
	
}
