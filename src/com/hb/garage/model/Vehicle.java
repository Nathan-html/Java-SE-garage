package com.hb.garage.model;

public abstract class Vehicle {
	
    private int id;
    private String name;
    private Owner owner;
    // Car or Bike
    private String type;
    
    public Vehicle(int id, String name, Owner owner) {
    	this.id = id;
    	this.name = name;
    	this.owner = owner;
    }
    
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
