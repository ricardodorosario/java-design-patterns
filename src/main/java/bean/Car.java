package bean;

/**
 * Classe abstrata que irá ajudar na criação de crew e passenger
 * É o produto abstrato
 * @author ricardo
 *
 */
public abstract class Car implements Cloneable{
	private String name;
	private String model;
	private String year;
	private String engine;
	private Boolean isFourDoors;
	private Boolean isAutomatic;
	
	public Car(String name, String model, String year, String engine, Boolean isFourDoors, Boolean isAutomatic) {
		this.name = name;
		this.model = model;
		this.year = year;
		this.engine = engine;
		this.isFourDoors = isFourDoors;
		this.isAutomatic = isAutomatic;
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
}
