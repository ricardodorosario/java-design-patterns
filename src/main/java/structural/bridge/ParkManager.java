package structural.bridge;

import bean.Vehicle;

public class ParkManager {
	protected IVehiclePark vehiclePark;
	
	public ParkManager(IVehiclePark vehiclePark) {
		this.vehiclePark = vehiclePark;
	}
	
	public void park(Vehicle vehicle) {
		vehiclePark.park(vehicle);
	}
	
	public void unpark(Vehicle vehicle) {
		vehiclePark.unpark(vehicle);
	}
	
	public void displayQtVehiclesParked() {
		vehiclePark.displayQtVehiclesParked();
	}
	
}
