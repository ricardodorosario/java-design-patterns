package creational.abstractFactory;

import bean.Car;

/**
 * Fábrica abstrata de carros
 * Abstract Factory encapsula a criação de mais de um produto de uma vez só.
 * @author ricardo
 *
 */
public abstract class AbstractCarFactory {
	public abstract Car createCivic(String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic);
	public abstract Car createCorolla(String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic);
}
