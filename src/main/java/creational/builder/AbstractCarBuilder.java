package creational.builder;

import bean.Vehicle;

public abstract class AbstractCarBuilder {
	protected Boolean isFourDoors = false;
	protected Boolean isAutomatic = false;
	protected String engine = "1.0";
	protected String model = "S";
	
	abstract void setDoors(Integer doors);
	abstract void setEngine(String engine);
	abstract void setModel(String model);
	abstract void setAutomatic(Boolean isAutomatic);
	abstract Vehicle getCar();
}
