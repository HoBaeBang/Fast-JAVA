package ch15by2;

public class BookShelf extends Shelf implements Queue {
//  � ũ������ ������ �Ҷ� �̹� �߸������ �ڱ⺸�� �Ϲ����� Ŭ�������� ����� �ް�
//	�ڱⰡ �����ؾ��ϴ� ����� ����Ǿ��ִ� �������̽��� �������ϴ� ������ �Ǿ��ִ�.
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {	//ArrayList������ remove�� ����ϸ� ��Ұ����ŵȴ�
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
