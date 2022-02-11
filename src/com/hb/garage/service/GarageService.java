package com.hb.garage.service;

import java.util.List;
import java.util.Scanner;

import com.hb.garage.model.Garage;
import com.hb.garage.model.Vehicle;
import com.hb.garage.service.action.GarageMenu;

public class GarageService {

	private Scanner req = new Scanner(System.in);
	private GarageData data = new GarageData();
	private Garage garage = data.getGarage();
	
	public void run() {
		this.chooseAction();
	}

	private void printMenu(GarageMenu[] menu) {
		for(GarageMenu item : menu) {
			System.out.println(item.toString());
		}
	}
	
	private Boolean handleMenuReq(GarageMenu[] menu, int req) {
		if ( req < 0 || req >= menu.length ) {
			return false;
		}
		if ( req < menu.length && req >= 0) {
			return true;
		}
		else { return false; }
	}
	
	private void chooseAction() {
		
		boolean Exit = false;
		
		do {
			
			this.printMenu(GarageMenu.values());
			System.out.print("Choisi une action > ");
			int action = req.nextInt();
			
			if (handleMenuReq(GarageMenu.values(), action)) {
				
				if(action == 0) {
					System.out.println("Merci d'être passer");
					Exit = true;
				}
				if(action == 1) {
					list(garage.getVehclePending(), true);
				}
				if(action == 2) {
					list(garage.getVehicleInProgress(), false);
				}
				if(action == 3) {
					list(garage.getVehicleDone(),false);
				}
				
			}
		} while (!Exit);

	}
	
	private void list(List<Vehicle> vehicles, Boolean option) {
		if (!vehicles.isEmpty()) {
			System.out.println("\r\n");
			int id = 1;
			for (Vehicle vehicle : vehicles) {
				if (option) {
					System.out.println(id + " - " + vehicle.toString());
					id++;
				}
				if(!option) {
					System.out.println("> " + vehicle.toString());	
				}
			}
			System.out.println("\r\n");
		} else {
			System.out.println("\r\n> Aucun vehicule n'a été trouvée\r\n");
		}
	}
}
