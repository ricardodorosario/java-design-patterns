package bean;

/**
 * Classe abstrata que irá ajudar na criação de crew e passenger
 * É o produto abstrato
 * @author ricardo
 *
 */
public abstract class Vehicle implements Cloneable{
	private String type; // Car, Bike
	private String name; // Civic, Kawazaki
	private String model; // XR, Ninja
	private String year; // 2020
	private String engine; // 1.0
	private Boolean isFourDoors;
	private Boolean isAutomatic;
	
	public Vehicle(String name, String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic, String type) {
		this.name = name;
		this.model = model;
		this.year = year;
		this.engine = engine;
		this.isFourDoors = isFourDoors;
		this.isAutomatic = isAutomatic;
		this.type = type;
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

	public String getEngine() {
		return engine;
	}

	public Boolean getIsFourDoors() {
		return isFourDoors;
	}

	public Boolean getIsAutomatic() {
		return isAutomatic;
	}
	
	public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }

	public String getType() {
		return type;
	}
}
