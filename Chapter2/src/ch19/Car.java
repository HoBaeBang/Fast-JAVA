package ch19;

public class Car {
	private static int serialNumber = 10000;
	private int carNumber;
	
	public Car() {
		serialNumber++;
		carNumber =serialNumber;
	}
	
	public int getCarNumber() {
		return carNumber;
	}
	
}
