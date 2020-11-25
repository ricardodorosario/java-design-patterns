package creational.prototype;

import java.util.Hashtable;

import bean.Car;
import creational.singleton.Console;

/**
 * gera um clone de cada carro no map de carros
 * @author ricardo
 *
 */
public class CarPrototype<T extends Car> {
	
	private static Hashtable<String, Car> carMap  = new Hashtable<String, Car>();
	Console console = Console.getInstance();
	
	public void cloneCar(String index, T car) {
		carMap.put(index, (Car) car.clone());
	}
	
	public void showCars() {
		carMap.forEach((i,c) -> console.log(c.getName()+" - "+c.getModel()+" - "+c.getYear()+" - "+c.getEngine()+" - "+c.getIsAutomatic()+" - "+c.getIsFourDoors()));
	}
}
