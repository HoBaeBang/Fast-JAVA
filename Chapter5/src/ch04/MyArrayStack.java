package ch04;

import ch02.MyArray;

public class MyArrayStack {
	
	MyArray arrayStack;	//stack을 구현하기 위해 이용할 배열변수를 선언
	int top;			//stack은 위에 게속 쌓는다고 생각하면 되기때문에 Top을 알아야할 필요가 있따.
	
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	/////////////////////////////////////////////////////////////
	
	public void push(int data) {//데이터 넣기 stack의 특성상 중간에 넣는게 아니라 그냥 쌓는다.
		if ( isFull() ) {
			System.out.println("stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++;
		
	}
	
	public int pop() {	//꺼내고 삭제함
		if ( isEmpty() ) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}
	
	public int peek() {	//구냥 꺼냄
		if ( isEmpty() ) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
	}
	
	/////////////////////////////////////////////////////////////
	
	public boolean isFull() {
		if(top == arrayStack.ARRAY_SIZE) {
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		else return false;
	}
	
	public void printAll()
	{
		arrayStack.printAll();
	}

}
