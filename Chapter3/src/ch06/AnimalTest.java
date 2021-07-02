package ch06;
/*  ��ǻ�Ͱ������� 2019150050 �ų���
	6�� �������� 26��(�������� ��) */
class Animal{											//�θ� Ŭ������ �ִϸ� Ŭ������ ����

	public void move() {
		System.out.println("������ ����������.");
	}
	
	public void eating() {
	}
}

class Human extends Animal{								// �ִϸ� Ŭ������ ����� �޴� �ڽ�Ŭ���� �޸� Ŭ����

	@Override
	public void move() {								// �θ� Ŭ������ �޼��带 �������Ѵ�.
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {							// ��� Ư���� Ư¡�� �־���
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{								// �ִϸ� Ŭ������ ����� �޴� �ڽ� Ŭ���� Ÿ�̰� Ŭ����

	@Override
	public void move() {								// �θ� Ŭ������ �޼��带 �������Ѵ�.
		System.out.println("ȣ���̰� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void hunting() {								// ȣ���� Ư���� Ư¡�� �־���
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal{								// �ִϸ� Ŭ������ ����� �޴� �ڽ� Ŭ���� �̱� Ŭ����
	@Override
	public void move() {								// �θ� Ŭ������ �޼��带 �������Ѵ�.
		System.out.println("�������� �ϴ��� ���� �ٴմϴ�.");
	}
	public void flying() {								// ������ Ư���� Ư¡�� �־���	
		System.out.println("�������� �糯���� �� ��� ���� �ٴմϴ�.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();					//�ν��Ͻ� ����
		Animal tAnimal = new Tiger();					//�ν��Ͻ� ����
		Animal eAnimal = new Eagle();					//�ν��Ͻ� ����
		Animal animal = new Animal();					//�ν��Ͻ� ����
		
		AnimalTest test = new AnimalTest();				//���� Ŭ������ ��ü�� ����
		test.moveAnimal(animal);						//���� �ȿ� ���� �ν��Ͻ��� �Ű������� �ְ� ���긦 ����
		test.moveAnimal(hAnimal);						//�̰����� ���ؼ� �θ� Ŭ������ ���갡 ���� ���·� �����Ǿ� ����Ǵ°��� �� �� �ִ�.
		test.moveAnimal(tAnimal);						//�������� �� Ȱ���ϸ� �����ϰ� Ȯ�强�ְ�, ���������� ���� ���α׷��� ����� ����
		test.moveAnimal(eAnimal);			
	}
		
	public void moveAnimal(Animal animal) { 			//�ִϸ� Ŭ������ �Ű������� �޾Ƽ� ���긦 �ϴ� �޼��� main �Լ����� ����ϱ� ����
		animal.move();
	}
}
