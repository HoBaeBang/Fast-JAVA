package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber myNumber = (x,y) -> x>y? x:y; //3�� ������ ���ǽ��� �������� true�̸� ��1�� ����� ��� false�̸� ��2�� ����� ��´�.
		System.out.println(myNumber.getMax(10,20));
	}

}
