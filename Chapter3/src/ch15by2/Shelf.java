package ch15by2;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	//ArrayList<String> shelf = new ArrayList<String>();
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf(){ //Ÿ����ü�� ArrayList�̱� ������ �տ� ArrayList<String>�� �ٿ���� �Ѵ�.~!�̸��̾�~
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
