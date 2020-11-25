package creational.factory;

import bean.Car;

/**
 * Fábrica abstrata de carros
 * Factory encapsula a criaçã de um objeto (produto).
 * @author ricardo
 *
 */
public abstract class CarFactory {
	public abstract Car create(String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic);
}
