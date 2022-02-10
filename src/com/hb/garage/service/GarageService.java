package com.hb.garage.service;

public class GarageService {

	private GarageData Data;

	public GarageService() {
		Data = new GarageData();
	}
	
	public void run() {
		System.out.println(Data.get("lambo").getName());
	}

}
