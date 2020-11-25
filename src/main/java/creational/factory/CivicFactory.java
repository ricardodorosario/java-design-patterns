package creational.factory;

import bean.Civic;
import bean.Vehicle;

/**
 * Fábrica de Civic
 * @author ricardo
 *
 */
public class CivicFactory extends CarFactory {

	@Override
	public Vehicle create(String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic) {
		return new Civic(model, year, engine, isFourDoors, isAutomatic);
	}
 
}
