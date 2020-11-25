package creational.factory;

import bean.Vehicle;

/**
 * Fábrica abstrata de carros
 * Factory encapsula a criaçã de um objeto (produto).
 * @author ricardo
 *
 */
public abstract class CarFactory {
	public abstract Vehicle create(String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic);
}
