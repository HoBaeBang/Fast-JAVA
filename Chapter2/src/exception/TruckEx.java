package exception;

public class TruckEx {

	public static void main(String[] args) {
		
		Truck truck = new Truck();
		
		truck.upSpeed(80);
		System.out.println("upSpeed(80)�� ��� Speed = "+truck.getSpeed()); 
		
		truck.downSpeed(30);
		System.out.println("downSpeed(30)�� ��� Speed = "+truck.getSpeed());
		
		truck.upSpeed(200);
		System.out.println("upSpeed(200)�� ��� Speed = "+truck.getSpeed()); //���� (1)��
		
		
		Truck truck2 = new Truck(6000);
		System.out.println("truck2�� ��ⷮ�� "+truck2.getCC()+"cc�Դϴ�."); //���� (2)��
		
		System.out.println("truck2�� �������� "+Truck.YEAR+"�Դϴ�."); //���� (3)��
	}

}
