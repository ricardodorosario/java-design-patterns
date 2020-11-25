package factory;

import bean.Car;

/**
 * Fábrica abstrata de carros
 * Factory encapsula como se instancia um objeto.
 * @author ricardo
 *
 */
public abstract class CarFactory {
	public abstract Car createCar(String model, String year);
}
