package ch15;

public class TaxiRide {

	public static void main(String[] args) {
		Person person = new Person("Edward",20000);
		Taxi taxi = new Taxi("�߳����� ���");
		
		person.takeTaxi(taxi);
		
		person.showPersonInfo();
		taxi.showTaxiInfo();
	}

}
