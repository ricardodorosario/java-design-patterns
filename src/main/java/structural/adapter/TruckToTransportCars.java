package structural.adapter;

import java.util.List;

import bean.Car;

public class TruckToTransportCars {
	private List<Car> cars;
	public TruckToTransportCars(List<Car> cars) {
		setCars(cars);
	}

	public List<Car> getCars() {
		return cars;
	}
	private void setCars(List<Car> cars) {
		this.cars = cars;
	}

}
