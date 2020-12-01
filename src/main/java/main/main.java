package main;

import bean.Vehicle;

import java.util.ArrayList;
import java.util.List;

import bean.Bike;
import bean.Car;
import bean.Civic;
import bean.Corolla;
import bean.Door;
import bean.PieceToBuildVehicle;
import bean.Screw;
import bean.Tire;
import creational.prototype.CarPrototype;
import creational.singleton.Console;
import structural.adapter.BikeAdapter;
import structural.adapter.TruckToTransportCars;
import structural.bridge.CarPark;
import structural.bridge.ParkManager;

public class main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/**
		 * Singleton
		 */
		Console console = Console.getInstance();
        // console.log("Teste 1");
        // console.log("Teste 2");
        // Console.getInstance().log("Teste 3");

		/**
		 * Factory
		 */
		// CivicFactory civicFactory = new CivicFactory();
		// CorollaFactory corollaFactory = new CorollaFactory();
		//Cria os carros
		// Car civic = civicFactory.create("XR3", "2010");
		// Car corolla = corollaFactory.create("XL", "2014");
		// console.log(civic.getName()+" - "+civic.getModel()+" - "+civic.getYear());
		// console.log(corolla.getName()+" - "+corolla.getModel()+" - "+corolla.getYear());

		/**
		 * Abstract Factory
		 */
		// CarAbstractFactory retailFactory = new RetailFactory();
		// Car civic = retailFactory.createCivic("SL", "2020");
		// Car corolla = retailFactory.createCorolla("XSX", "2018");
		// console.log(civic.getName()+" - "+civic.getModel()+" - "+civic.getYear());
		// console.log(corolla.getName()+" - "+corolla.getModel()+" - "+corolla.getYear());

		/**
		 * Builder
		 */
		// //Construtor dos carros
		// CivicBuilder civicBuilder = new CivicBuilder();
		// //Classe que monta e entrega os carros de acordo com o contrutor de carros
		// Worker worker = new Worker();
		// worker.contructCheapestCar(civicBuilder);
		// Car civic = civicBuilder.getCar();
		// console.log(civic.getName()+" - "+civic.getModel()+" - "+civic.getYear()+" - "+civic.getEngine()+" - "+civic.getIsAutomatic()+" - "+civic.getIsFourDoors());
		/**
		 * Prototype
		 */
		// CarPrototype<Vehicle> cp = new CarPrototype<Vehicle>();
		// Civic civic = new Civic("XL", "2020", "1.2", true, false);
		// Corolla corolla = new Corolla("SS", "2020", "1.1", false, false);
		// cp.cloneCar("1", civic);
		// cp.cloneCar("2", corolla);
		// cp.cloneCar("3", civic);
		// cp.showCars();



		/**
		 * Adapter
		 */
		// Car car = new Car("Civic", "XS", "2000", "1.0", true, true);
		// Bike bike = new Bike("Kawazaki", "Ninja", "2020", "3.0", false, false);
		// BikeAdapter bikeAdapted = new BikeAdapter(bike);
		// List<Car> listCars = new ArrayList<Car>();
		// listCars.add(car);
		// listCars.add(bikeAdapted);
		// TruckToTransportCars truck = new TruckToTransportCars(listCars);
		// truck.getCars().forEach(carr -> console.log(carr.getName()));
		/**
		 * Bridge
		 */
		// CarPark carPark = new CarPark();
		// Car bmw = new Car("BMW", "XR", "2020", "1.0", true, true);
		// ParkManager pm = new ParkManager(carPark);
		// pm.park(new Civic("XR", "2020", "1.0", true, true));
		// pm.park(new Corolla("XR", "2020", "1.0", true, true));
		// pm.park(bmw);
		// pm.unpark(bmw);
		// pm.displayQtVehiclesParked();
		/**
		 * Composite
		 */
		// Door door = new Door(1);
		// Tire tire = new Tire(1);
		// Screw screw1 = new Screw(1);
		// Screw screw2 = new Screw(2);
		// Screw screw3 = new Screw(3);
		// door.addChildren(screw1);
		// door.addChildren(screw2);
		// tire.addChildren(screw3);
		// door.getChildren().forEach(item -> console.log(((PieceToBuildVehicle) item).getName() + ((PieceToBuildVehicle) item).getId()));
		// tire.getChildren().forEach(item -> console.log(((PieceToBuildVehicle) item).getName() + ((PieceToBuildVehicle) item).getId()));
	}
}
