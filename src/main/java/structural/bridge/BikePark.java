package structural.bridge;

import java.util.ArrayList;
import java.util.List;

import bean.Vehicle;
import creational.singleton.Console;

public class BikePark implements IVehiclePark{
	
	private Console console = Console.getInstance();
	private List<Vehicle> bikesParked = new ArrayList<Vehicle>();  
	
	@Override
	public void park(Vehicle bike) {
		bikesParked.add(bike);
		
	}

	@Override
	public void unpark(Vehicle bike) {
		bikesParked.remove(bike);
		
	}

	@Override
	public void displayQtVehiclesParked() {
		console.log(String.valueOf(bikesParked.size()));
		
	}

}
