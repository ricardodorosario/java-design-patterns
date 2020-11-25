package bean;

public class Car extends Vehicle{

	public Car(String name, String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic) {
		super(name, model, year, engine, isFourDoors, isAutomatic, "Car");
	}

}
