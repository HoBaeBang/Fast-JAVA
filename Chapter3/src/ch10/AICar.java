package ch10;

public class AICar extends Car{

	@Override
	public void drive() {
		
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �م��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �տ��� ������ ����ϴ�.");
	}

	@Override
	public void washCar() {
		System.out.println("�ڵ� ������ �մϴ�.");	
	}

	@Override
	public void wiper() {
		// TODO �ڵ� ������ �޼ҵ� ����
		
	}

	
}