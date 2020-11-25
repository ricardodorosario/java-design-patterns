package creational.abstractFactory;

import bean.Car;
import bean.Civic;
import bean.Corolla;

/**
 * Fábrica da loja de carros utilizando
 * Abstract Factory 
 * @author ricardo
 *
 */
public class RetailFactory extends AbstractCarFactory{

	@Override
	public Car createCivic(String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic) {
		return new Civic(model, year, engine, isFourDoors, isAutomatic);
	}

	@Override
	public Car createCorolla(String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic) {
		return new Corolla(model, year, engine, isFourDoors, isAutomatic);
	}
}
