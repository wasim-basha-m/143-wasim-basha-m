package com.marticus.train1;

public class Library {
	int numbooks;

	public int getNumbooks() {
		return numbooks;
	}

	public void setNumbooks(int numbooks) {
		this.numbooks = numbooks;
	}
	
	int returnbooks() {
		return numbooks++;
	}
	int	lendbooks() {
		return --numbooks;
	}
}
