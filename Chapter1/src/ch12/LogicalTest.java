package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 =10;
		int  i = 2;
		boolean value = ((num1 = num1+10) > 10) || ((i+=2) < 10);
		//뒤의 결과를 볼필요가 없을경우 뒤에 적어놓은 연산이 실행하지 않는다.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
