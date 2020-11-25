package creational.abstractFactory;

import bean.Vehicle;

/**
 * Fábrica abstrata de carros
 * Abstract Factory encapsula a criação de mais de um produto de uma vez só.
 * @author ricardo
 *
 */
public abstract class AbstractCarFactory {
	public abstract Vehicle createCivic(String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic);
	public abstract Vehicle createCorolla(String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic);
}
