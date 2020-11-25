package creational.builder;

public class Worker {
	public void contruct4DoorsAutomaticCar(AbstractCarBuilder builder) {
		builder.setEngine("2.0");
		builder.setAutomatic(true);
		builder.setDoors(4);
		builder.setModel("XS");
	}
	
	public void contructCheapestCar(AbstractCarBuilder builder) {
		builder.setEngine("1.0");
		builder.setAutomatic(false);
		builder.setDoors(2);
		builder.setModel("S");
	}
	
}
