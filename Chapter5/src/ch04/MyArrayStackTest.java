package ch04;

public class MyArrayStackTest {

	public static void main(String[] args) {
		
		MyArrayStack stack = new MyArrayStack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.printAll();	//꽉찼다고 나올것임
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		//스택 구조의 특징은 위로쌓는 느낌의 자료구조라는 점이고
		//push, pop, peek을 이용해서 데이터를 다룬다
		//push는 저장 기능을 담당하고 pop,peek은 정보를 가져오는데
		//pop은 데이터를 가져오고 삭제하고 peek은 삭제하지 않고 가져오기만한다.
	}

}
