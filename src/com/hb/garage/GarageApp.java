package com.hb.garage;

import com.hb.garage.service.GarageService;

public class GarageApp {

	public static void main(String[] args) {
		/* 
		 * Le but du programme est de g�rer les entr�es/sorties de v�hicules dans un garage,
		 * ainsi que les coordonn�es de leurs propri�taires afin de pouvoir les contacter
		 * lorsque les travaux d�entretien ou de r�paration sont termin�s.
		 */
		new GarageService().run();
	}

}
