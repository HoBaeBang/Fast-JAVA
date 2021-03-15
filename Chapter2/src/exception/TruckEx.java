package exception;

public class TruckEx {

	public static void main(String[] args) {
		
		Truck truck = new Truck();
		
		truck.upSpeed(80);
		System.out.println("upSpeed(80)의 결과 Speed = "+truck.getSpeed()); 
		
		truck.downSpeed(30);
		System.out.println("downSpeed(30)의 결과 Speed = "+truck.getSpeed());
		
		truck.upSpeed(200);
		System.out.println("upSpeed(200)의 결과 Speed = "+truck.getSpeed()); //과제 (1)번
		
		
		Truck truck2 = new Truck(6000);
		System.out.println(truck2.getCC()); //과제 (2)번
		
		System.out.println(Truck.YEAR); //과제 (3)번
	}

}
