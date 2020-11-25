package structural.bridge;

import bean.Vehicle;

public interface IVehiclePark {
	public void park(Vehicle car);
	public void unpark(Vehicle car);
	public void displayQtVehiclesParked();
}
