package ch15by2;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	//ArrayList<String> shelf = new ArrayList<String>();
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf(){ //타입자체가 ArrayList이기 때문에 앞에 ArrayList<String>을 붙여줘야 한다.~!이말이야~
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
