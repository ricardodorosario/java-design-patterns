package creational.factory;

import bean.Vehicle;
import bean.Corolla;

/**
 * Fábrica de Corolla
 * @author ricardo
 *
 */
public class CorollaFactory extends CarFactory {

	@Override
	public Vehicle create(String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic) {
		return new Corolla(model, year, engine, isFourDoors, isAutomatic);
	}
	
}
