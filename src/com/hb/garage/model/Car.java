package com.hb.garage.model;

public class Car extends Vehicle{

	private int numberOfDoors;
	
	public Car(int id, String name, Owner owner, int numberOfDoors) {
		super(id, name, owner);
		this.numberOfDoors = numberOfDoors;
		this.setType("Car");
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
}
