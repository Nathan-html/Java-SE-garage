package com.hb.garage.model;

public class Bike extends Vehicle {
	
	private int numberOfSeats;

	public Bike (int id, String name, Owner owner, int numberOfSeats) {
		super(id, name, owner);
		this.setNumberOfSeats(numberOfSeats);
		this.setType("Bike");
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
    @Override
    public String toString() {
        return  this.superToString().substring(0, this.superToString().length() - 1) +
                ", numberOfSeats=" + numberOfSeats + '}';
    }
}
