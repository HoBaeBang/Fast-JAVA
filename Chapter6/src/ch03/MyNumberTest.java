package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber myNumber = (x,y) -> x>y? x:y; //3항 연산자 조건식의 연산결과가 true이면 식1을 결과로 얻고 false이면 식2를 결과로 얻는다.
		System.out.println(myNumber.getMax(10,20));
	}

}
