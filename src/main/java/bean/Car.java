package bean;

/**
 * Classe abstrata que irá ajudar na criação de crew e passenger
 * É o produto abstrato
 * @author ricardo
 *
 */
public abstract class Car {
	private String name;
	private String model;
	private String year;
	
	public Car(String name, String model, String year) {
		this.name = name;
		this.model = model;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

	public String getYear() {
		return year;
	}
		
}
