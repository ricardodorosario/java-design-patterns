package creational.builder;

import bean.Vehicle;
import bean.Corolla;

public class CorollaBuilder extends AbstractCarBuilder {

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
	public Vehicle getCar() {
		return new Corolla(this.model, "2020", this.engine, this.isFourDoors, this.isAutomatic);
	}

}
