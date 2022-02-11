package com.hb.garage.service;

import java.util.List;

import com.hb.garage.model.Garage;
import com.hb.garage.model.Vehicle;
import com.hb.garage.service.action.GarageMenu;
import com.hb.garage.utils.ConsoleManager;

public class GarageService {

	private GarageData data = new GarageData();
	private Garage garage = data.getGarage();
	
	public void run() {
		ConsoleManager.getInstance().printToConsole("Bienvenu chez le garage", true);
		this.chooseAction();
	}

	private void printMenu(GarageMenu[] menu) {
		for(GarageMenu item : menu) {
			ConsoleManager.getInstance().printToConsole(item.toString(), true);
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
			ConsoleManager.getInstance().printToConsole("Choisi une action > ", false);
			int action = ConsoleManager.getInstance().readUserInputInteger();
			
			if (handleMenuReq(GarageMenu.values(), action)) {
				
				if(action == 0) {
					ConsoleManager.getInstance().printToConsole("Merci d'être passer", false);
					// System.out.println("Merci d'être passer");
					Exit = true;
				}
				if(action == 1) {
					printList(garage.getVehclePending(), true);
				}
				if(action == 2) {
					printList(garage.getVehicleInProgress(), false);
				}
				if(action == 3) {
					printList(garage.getVehicleDone(),false);
				}
				
			}
		} while (!Exit);

	}
	
	private void printList(List<Vehicle> vehicles, Boolean option) {
		ConsoleManager.getInstance().printLine();
		list(vehicles, option);
		ConsoleManager.getInstance().printLine();
	}
	
	private void list(List<Vehicle> vehicles, Boolean option) {
		if (!vehicles.isEmpty()) {
			int id = 1;
			for (Vehicle vehicle : vehicles) {
				if (option) {
					ConsoleManager.getInstance().printToConsole(id + " - " + vehicle.toString(), true);
					id++;
				}
				if(!option) {
					ConsoleManager.getInstance().printToConsole("> " + vehicle.toString(), true);
				}
			}
		} else {
			ConsoleManager.getInstance().printToConsole("Aucun vehicule n'a été trouvée", true);
		}
	}
}
