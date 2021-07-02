package ch06;
/*  컴퓨터공학전공 2019150050 신나은
	6장 연습문제 26번(다형성의 예) */
class Animal{											//부모 클래스인 애니멀 클래스를 선언

	public void move() {
		System.out.println("동물이 움직입지다.");
	}
	
	public void eating() {
	}
}

class Human extends Animal{								// 애니멀 클래승의 상속을 받는 자식클래스 휴먼 클래스

	@Override
	public void move() {								// 부모 클래스의 메서드를 재정의한다.
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {							// 사람 특유의 특징을 넣어줌
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{								// 애니멀 클래스의 상속을 받는 자식 클래스 타이거 클래스

	@Override
	public void move() {								// 부모 클래스의 메서드를 재정의한다.
		System.out.println("호랑이가 네 발로 걷습니다.");
	}
	
	public void hunting() {								// 호랑이 특유의 특징을 넣어줌
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{								// 애니멀 클래스의 상속을 받는 자식 클래스 이글 클래스
	@Override
	public void move() {								// 부모 클래스의 메서드를 재정의한다.
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	public void flying() {								// 독수리 특유의 특징을 넣어줌	
		System.out.println("독수리가 양날개를 쭉 펴고 날아 다닙니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();					//인스턴스 생성
		Animal tAnimal = new Tiger();					//인스턴스 생성
		Animal eAnimal = new Eagle();					//인스턴스 생성
		Animal animal = new Animal();					//인스턴스 생성
		
		AnimalTest test = new AnimalTest();				//메인 클래스를 객체로 생성
		test.moveAnimal(animal);						//메인 안에 만든 인스턴스를 매개변수로 주고 무브를 실행
		test.moveAnimal(hAnimal);						//이과정을 통해서 부모 클래스인 무브가 여러 형태로 구현되어 실행되는것을 볼 수 있다.
		test.moveAnimal(tAnimal);						//다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음
		test.moveAnimal(eAnimal);			
	}
		
	public void moveAnimal(Animal animal) { 			//애니멀 클래스를 매개변수로 받아서 무브를 하는 메서드 main 함수에서 사용하기 위함
		animal.move();
	}
}
