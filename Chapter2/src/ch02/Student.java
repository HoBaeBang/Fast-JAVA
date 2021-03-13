package ch02;
/*하나의 자바파일안에 클래스가 여러개일수있다. 
 * 하지만 이중에서 퍼블릭이란키워드를가진 클래스는 단하나고 클래스이름과 자바파일 이름은 동일해야한다.*/
public class Student {//퍼블릭이라는것은 공용이다 어디서든지 접근이 가능하다. 접그근제어자
	
	int studentNumber;
	String studentName;//변수나 메서드의 시작은 소문자로한다.
	int majorCode;
	String majorName;
	int grade;//객체의 속성을 나타내는 변수를 멤버변수라고 한다.
	
}
