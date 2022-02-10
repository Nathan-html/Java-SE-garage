package com.hb.garage.model;

import java.util.LinkedList;
import java.util.List;

public class Garage {
	// maximum number of Vehicles in progress
	private int maxV;
	private List<Vehicle> vehclePending;
	private List<Vehicle> vehicleInProgress;
	private List<Vehicle> vehicleDone;
	
	public Garage(int maxV) {
		this.setMaxV(maxV);
		this.vehclePending = new LinkedList<>();
		this.vehicleInProgress = new LinkedList<>();
		this.vehicleDone = new LinkedList<>();
	}

	public List<Vehicle> getVehclePending() {
		return vehclePending;
	}

	public List<Vehicle> getVehicleInProgress() {
		return vehicleInProgress;
	}

	public List<Vehicle> getVehicleDone() {
		return vehicleDone;
	}

	public int getMaxV() {
		return maxV;
	}

	public void setMaxV(int maxV) {
		this.maxV = maxV;
	}
}
