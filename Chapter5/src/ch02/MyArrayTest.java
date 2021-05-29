package ch02;

public class MyArrayTest {

	public static void main(String[] args) {

		MyArray list = new MyArray(6);
		list.addElement(8);
		list.addElement(4);
		list.addElement(1);
		list.addElement(3);
		list.addElement(6);
		list.addElement(5);
		
		list.removeElement(1);
		list.printAll();
		
	}

}
