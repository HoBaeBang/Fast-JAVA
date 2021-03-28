package ch15by2;

public class BookShelf extends Shelf implements Queue {
//  어떤 크래스를 생성을 할때 이미 잘만들어진 자기보다 일반적인 클래스에서 상속을 받고
//	자기가 구현해야하는 기능이 선언되어있는 인터페이스를 구현을하는 구도로 되어있다.
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {	//ArrayList에대해 remove를 사용하면 요소가제거된다
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
