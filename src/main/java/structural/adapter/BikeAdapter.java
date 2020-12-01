package structural.adapter;

import bean.Bike;
import bean.Car;

public class BikeAdapter extends Car{

	public BikeAdapter(Bike bike) {
		super(bike.getName(), bike.getModel(), bike.getYear(), bike.getEngine(), bike.getIsFourDoors(), bike.getIsAutomatic());
	}

}
