package ch04;

public class MyArrayStackTest {

	public static void main(String[] args) {
		
		MyArrayStack stack = new MyArrayStack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.printAll();	//��á�ٰ� ���ð���
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		//���� ������ Ư¡�� ���ν״� ������ �ڷᱸ����� ���̰�
		//push, pop, peek�� �̿��ؼ� �����͸� �ٷ��
		//push�� ���� ����� ����ϰ� pop,peek�� ������ �������µ�
		//pop�� �����͸� �������� �����ϰ� peek�� �������� �ʰ� �������⸸�Ѵ�.
	}

}
