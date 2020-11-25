package main;

import bean.Car;
import factory.CivicFactory;
import factory.CorollaFactory;
import singleton.Console;

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
		CivicFactory civicFactory = new CivicFactory();
		CorollaFactory corollaFactory = new CorollaFactory();
		//Cria os carros
		Car civic = civicFactory.createCar("XR3", "2010");
		Car corolla = corollaFactory.createCar("XL", "2014");
		console.log(civic.getName()+" - "+civic.getModel()+" - "+civic.getYear());
		console.log(corolla.getName()+" - "+corolla.getModel()+" - "+corolla.getYear());
	}
}
