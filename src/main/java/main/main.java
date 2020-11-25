package main;

import bean.Vehicle;
import bean.Car;
import bean.Civic;
import bean.Corolla;
import creational.prototype.CarPrototype;
import creational.singleton.Console;
import structural.bridge.CarPark;
import structural.bridge.ParkManager;

public class main {
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
		 * Bridge
		 */
		CarPark carPark = new CarPark();
		Car bmw = new Car("BMW", "XR", "2020", "1.0", true, true);
		ParkManager pm = new ParkManager(carPark);
		pm.park(new Civic("XR", "2020", "1.0", true, true));
		pm.park(new Corolla("XR", "2020", "1.0", true, true));
		pm.park(bmw);
		pm.unpark(bmw);
		pm.displayQtVehiclesParked();
	}
}
