package structural.bridge;

import java.util.ArrayList;
import java.util.List;

import bean.Vehicle;
import creational.singleton.Console;

public class CarPark implements IVehiclePark{
	
	private Console console = Console.getInstance();
	private List<Vehicle> carsParked = new ArrayList<Vehicle>();  
	
	@Override
	public void park(Vehicle car) {
		carsParked.add(car);
		
	}

	@Override
	public void unpark(Vehicle car) {
		carsParked.remove(car);
		
	}

	@Override
	public void displayQtVehiclesParked() {
		console.log(String.valueOf(carsParked.size()));
		
	}

}
