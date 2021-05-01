package ch03;

@FunctionalInterface //함수형 인터페이스라는 어노테이션
public interface MyNumber {

		public int getMax(int num1,int num2);
		//함수형 인터페이스 안에는 하나의 메서드만 있어야 한다.
}
