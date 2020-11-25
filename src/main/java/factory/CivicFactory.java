package factory;

import bean.Civic;
import bean.Car;

/**
 * Fábrica de Civic
 * @author ricardo
 *
 */
public class CivicFactory extends CarFactory {

	@Override
	public Car createCar(String model, String year) {
		return new Civic(model, year);
	}
 
}
