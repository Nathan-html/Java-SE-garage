package com.hb.garage.service.action;

public enum GarageMenu {
	
	LIST_PENDING_VEHICLE(1, "Lister les v�hicules en cours d�entretien"),
	LIST_IN_PROGRESS_VEHICLE(2, "Lister les v�hicules en attente d�entretien"),
	LIST_VEHICLE_DONE(3, "Lister les v�hicules entretenu"),
	ENTRY_OF_A_NEW_VEHICLE(4, "G�rer l�entr�e d�un nouveau v�hicule"),
	START_REPAIR(5, "Commencer la r�paration du �ehicule"),
	VEHICLE_REPAIR(6, "Declarer une r�paration comme finit"),
	EXIT(0, "Exit");
	
	private int id;
	private String msg;
	
	GarageMenu (int req, String msg) {
		this.id = req;
		this.msg = msg;
	}

	public int getId() {
		return id;
	}

	public String getMessage() {
		return msg;
	}
	
    @Override
    public String toString() {
        return id + " - " + msg;
    }
}
