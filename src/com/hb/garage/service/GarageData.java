package com.hb.garage.service;

import com.hb.garage.model.Bike;
import com.hb.garage.model.Car;
import com.hb.garage.model.Garage;
import com.hb.garage.model.Owner;
import com.hb.garage.model.Vehicle;

public class GarageData {

	private Garage garage = new Garage(10);
	
	// private Car CarExemple = new Car(1, "name", new Owner("firstName", "lastName", "06 98 21 83 37"), 5);
	private Car Error = new Car(99, "error", new Owner("error", "error", "error"), 99);
	private Car lambo = new Car(1, "lambo", new Owner("charles", "bernard", "06 98 21 83 37"), 5);
	private Bike suzukiki = new Bike(2, "suzukiki", new Owner("paule", "gautier", "08 63 18 24 06"), 2);
	
	public GarageData() {
		garage.getVehclePending().add(lambo);
		garage.getVehclePending().add(suzukiki);
	}

	public Vehicle get(String item) {
		if (item.equals("lambo")) {
			return lambo;
		}
		if (item.equals("suzukiki")) {
			return suzukiki;
		}
		else {
			return Error;
		}
	}
	
}
