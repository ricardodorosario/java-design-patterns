package creational.builder;

import bean.Car;
import bean.Civic;

public class CivicBuilder extends AbstractCarBuilder {

	@Override
	void setDoors(Integer doors) {
		if(doors == 2) {
			this.isFourDoors = false;
		}
		if(doors == 4) {
			this.isFourDoors = true;
		}
		
	}

	@Override
	void setEngine(String engine) {
		this.engine = engine;
		
	}

	@Override
	void setAutomatic(Boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
		
	}

	@Override
	void setModel(String model) {
		this.model = model;
		
	}

	@Override
	public Car getCar() {
		return new Civic(this.model, "2020", this.engine, this.isFourDoors, this.isAutomatic);
	}

}
