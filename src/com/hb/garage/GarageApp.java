package com.hb.garage;

import com.hb.garage.service.GarageService;

public class GarageApp {

	public static void main(String[] args) {
		/* 
		 * Le but du programme est de gérer les entrées/sorties de véhicules dans un garage,
		 * ainsi que les coordonnées de leurs propriétaires afin de pouvoir les contacter
		 * lorsque les travaux d’entretien ou de réparation sont terminés.
		 */
		new GarageService().run();
	}

}
