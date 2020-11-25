package creational.prototype;

import java.util.Hashtable;

import bean.Vehicle;
import creational.singleton.Console;

/**
 * gera um clone de cada carro no map de carros
 * @author ricardo
 *
 */
public class CarPrototype<T extends Vehicle> {
	
	private static Hashtable<String, Vehicle> carMap  = new Hashtable<String, Vehicle>();
	Console console = Console.getInstance();
	
	public void cloneCar(String index, T car) {
		carMap.put(index, (Vehicle) car.clone());
	}
	
	public void showCars() {
		carMap.forEach((i,c) -> console.log(c.getName()+" - "+c.getModel()+" - "+c.getYear()+" - "+c.getEngine()+" - "+c.getIsAutomatic()+" - "+c.getIsFourDoors()));
	}
}
