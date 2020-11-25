package factory;

import bean.Car;
import bean.Corolla;

/**
 * Fábrica de Corolla
 * @author ricardo
 *
 */
public class CorollaFactory extends CarFactory {

	@Override
	public Car createCar(String model, String year) {
		return new Corolla(model, year);
	}
	
}
